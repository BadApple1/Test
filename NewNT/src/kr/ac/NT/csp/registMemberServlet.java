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
		resp.getWriter().println("�̸� : " + name +"<br>");
		resp.getWriter().println("�й� : " + stuid +"<br>");
		resp.getWriter().println("��ȭ��ȣ : " + phone +"<br>");
		resp.getWriter().println("�����ּ� : " + email +"<br>");
		resp.getWriter().println("īī������̵� : " + kakao +"<br>");
		if(leader == null)
			resp.getWriter().println("���� �ƴ�" +"<br>");
		else
			resp.getWriter().println("����" +"<br>");
		resp.getWriter().println("Github ID : " + gitid +"<br>");
		
		resp.getWriter().println("�� ��ϵǾ����ϴ�");
		
		resp.getWriter().println("<a href='index.html'> ó������</a>");
	}
}
