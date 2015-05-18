package kr.ac.NT.csp;

import java.io.IOException; 
import java.util.List; 
import javax.servlet.http.*; 
 

public class ReadMemberServlet extends HttpServlet{ 
 	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
 			throws IOException { 
 		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
 		
 		String name = req.getParameter("name"); 
 		 
 		List<Member> namedMemberList = MemberManager.getMemberByName(name); 
 		Member m = namedMemberList.get(0); 
 		 
 		
 		
 		 
 		resp.getWriter().println("<html>"); 
 		resp.getWriter().println("<body>"); 
 		resp.getWriter().println("�̸� : "+m.getName() +"<br>"); 
 		resp.getWriter().println("�й� : "+m.getStuid() +"<br>"); 
 		resp.getWriter().println("��ȭ��ȣ : "+m.getPhone() +"<br>"); 
 		resp.getWriter().println("�̸��� : "+m.getEmail() +"<br>"); 
 		resp.getWriter().println("īī������̵� : " + m.getKakao() + "<br>");
 		
 		
 		resp.getWriter().println("</body>"); 
 		resp.getWriter().println("</html>");
 		 
 	} 
 
 
} 

