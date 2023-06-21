package model2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import controller.CompleteController;
import controller.HomeController;
import controller.LoginformController;
import controller.RegisterController;
import controller.RegisterFormController;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "*.hta") // 모든 요청을 frontController가 받게한다.
public class FrontController extends HttpServlet{

	private Map<String, Controller> controllerMap = new HashMap<>();
	
	@Override // 서블릿의 초기화를 담당하는 메서드. 초기화일 때 딱 한번만 사용됨
	public void init() throws ServletException {
		controllerMap.put("/home.hta", new HomeController());
		controllerMap.put("/registerform.hta", new RegisterFormController());
		controllerMap.put("/register.hta", new RegisterController());
		controllerMap.put("/complete.hta", new CompleteController());
		controllerMap.put("/loginform.hta", new LoginformController());
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("### FrontController의 serviece(request, response) 실행됨.");
		
		// 1. 클라이언트의 요청을 분석해서 요청 URI를 알아낸다.
		String contextPath = request.getContextPath(); // /model2

		String requestURI = request.getRequestURI(); // 뭘 요청했는지 알아내기 가능 /model2/list.hta
		requestURI = requestURI.replace(contextPath,"");
		System.out.println("### FrontController - 요청 URI : " + requestURI); // /list.hta
		
		
		// 2. 요청 URI와 매핑된 Controller 객체를 가져온다. -> process 메서드 사용 가능
		Controller controller = controllerMap.get(requestURI);
		System.out.println("### FrontController - 컨트롤러 : " + controller); // controller.HomeController@62c9d37b
		if (controller == null) {
			throw new ServletException("["+requestURI+ "] 에 매핑되는 컨트롤러가 존재하지 않습니다.");
		}
		
		// 3. 컨트롤러의 process(request, response) 실행하기
		try {
			String path = controller.process(request, response);	
			System.out.println("### FrontController - path : " + path);
			if (path == null) {
				throw new Exception("컨트롤러의 반환값은 null일 수 없습니다.");
			}
			
			if (path.startsWith("redirect:")) { // 재요청
				// 클라이언트에게 재요청 URL을 응답으로 보낸다.
				path = path.replace("redirect:","");
				System.out.println("### FrontContoller - 재요청 URL 응답 : "+ path);
				response.sendRedirect(path);
			} else { // 내부이동
				// 클라이언트의 요청을 지정된 JSP로 내부이동 시킨다.
				// 결과적으로 클라이언트에게는 JSP 실행결과로 생성된 HTML 컨텐츠가 응답으로 보내진다.
				path = "/WEB-INF/views/" + path;
				System.out.println("### FrontController - JSP로 내부이동 : " + path);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
				requestDispatcher.forward(request, response); 
				// frontController, controller, dispatcer가 같은 request, response를 가지게 된다.
			}
		} catch (Exception ex) {
			throw new ServletException(ex);
		}
		
		
	}
}
