package kr.ac.NT.csp;

 
import java.io.IOException; 
import java.util.List; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
 
 
public class RetrieveMemberServlet extends HttpServlet{ 
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{ 
 		 
		List<Member> memberList = MemberManager.getAllMembers(); 
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		
		resp.getWriter().println("<HTML>"); 
 		resp.getWriter().println("<body>");  
		resp.getWriter().println("<table border='1'>");
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<th>"+"�̸�" + "</th>" );//��ó���� 
		resp.getWriter().println("<th>"+"�й�" + "</th>" );
		resp.getWriter().println("<th>"+"��ȭ��ȣ" + "</th>" );
		resp.getWriter().println("<th>"+"�����ּ�" + "</th>" );
		resp.getWriter().println("<th>"+"īī���� ���̵�" + "</th>" );
		resp.getWriter().println("<th>"+"���忩��" + "</th>" );
		resp.getWriter().println("<th>"+"GitHub ID" + "</th>" );
		resp.getWriter().println("<th>"+"ȸ������" + "</th>" );
		resp.getWriter().println("</tr>");
		
		for(Member m : memberList) 
		{ 
			resp.getWriter().println("<tr>"); 
			resp.getWriter().println("<td>" +  m.getName() +"</td>"); 
			resp.getWriter().println("<td>" + m.getStuid() +"</td>");
			resp.getWriter().println("<td>" + m.getPhone() + "</td>");
			resp.getWriter().println("<td>" + m.getEmail() + "</td>");
			resp.getWriter().println("<td>" + m.getKakao() + "</td>");
			resp.getWriter().println("<td>" + m.getLeader() + "</td>");
			resp.getWriter().println("<td>" + m.getGitid() + "</td>");
			resp.getWriter().println("<td>"+"<a href = '/DeleteMember?name="+m.getId()+">"+"</td>");
			resp.getWriter().println("</tr>"); 
		} 
		resp.getWriter().println("</table>"); 
		resp.getWriter().println("</body>"); 
		resp.getWriter().println("</HTML>"); 
		
		resp.getWriter().println("<a href='index.html'>ó������"); 
	} 
} 
