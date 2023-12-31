package controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model2.Controller;

/*
 * localhost/model2/register.hta 요청을 처리하는 컨트롤러다.
 * 등록, 삭제, 수정 등은 redirect -> 화면이 나오는 것이 아니다. 뷰가 없다
 */
public class RegisterController implements Controller{ 

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("RegisterController의 process(request, response)가 실행됨.");
		
		// 입력폼에서 서버로 전달한 요청파라미터값 조회하기
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		System.out.println("RegisterController 폼 입력값 확인 - id : " + id);
		System.out.println("RegisterController 폼 입력값 확인 - password : " + password);
		System.out.println("RegisterController 폼 입력값 확인 - name : " + name);
		System.out.println("RegisterController 폼 입력값 확인 - tel : " + tel);
		System.out.println("RegisterController 폼 입력값 확인 - email : " + email);
		
		return "redirect:complete.hta";
	}
}
