package controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model2.Controller;

/*
 * localhost/model2/registerform.hta 요청을 처리하는 컨트롤러다.
 */
public class RegisterFormController implements Controller{
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("RegisterFormController의 process(request, response)가 실행됨.");
		
		// 여기로 이동해야 한다는걸 FrontController에게 알려주고 있당게
		return "registerform.jsp";
	}
}
