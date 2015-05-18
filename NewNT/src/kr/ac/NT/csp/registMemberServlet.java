package kr.ac.NT.csp;

import java.io.IOException;

import javax.servlet.http.*;


@SuppressWarnings("serial")
public class registMemberServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		
		String name = req.getParameter("name");
		String stuid = req.getParameter("stuid");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		String kakao = req.getParameter("kakao");
		String leader = req.getParameter("leader");
		String gitid = req.getParameter("gitid");
		
		Member m = MemberManager.addMember(name, stuid, phone, email, kakao, leader, gitid);
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		
		resp.getWriter().println("<HTML>"); 
 		resp.getWriter().println("<body>"); 
		resp.getWriter().println("이름 : " + name +"<br>");
		resp.getWriter().println("학번 : " + stuid +"<br>");
		resp.getWriter().println("전화번호 : " + phone +"<br>");
		resp.getWriter().println("메일주소 : " + email +"<br>");
		resp.getWriter().println("카카오톡아이디 : " + kakao +"<br>");
		if(leader == null)
			resp.getWriter().println("팀장 아님" +"<br>");
		else
			resp.getWriter().println("팀장" +"<br>");
		resp.getWriter().println("Github ID : " + gitid +"<br>");
		
		resp.getWriter().println("이 등록되었습니다");
		
		resp.getWriter().println("<a href='index.html'> 처음으로</a>");
	}
}
