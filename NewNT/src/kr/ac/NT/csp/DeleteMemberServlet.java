package kr.ac.NT.csp;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DeleteMemberServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
	
	String key =  req.getParameter("key");
	Long longKey = Long.parseLong(key);
	
	resp.setCharacterEncoding("UTF-8");
	resp.setContentType("text/html");
	
	resp.getWriter().println("<html>");
	resp.getWriter().println("<body>");
	
	resp.getWriter().println("<h1>" +"������ �Ϸ�Ǿ����ϴ�!" + "<h2>");
	resp.getWriter().println("<a href=" +"retrive" + ">" + "�ڷΰ���" + "</a>"+"</br>");
	resp.getWriter().println("<a href=" +"index.html" + ">" + "ó������" + "</a>"+"</br>");

	resp.getWriter().println("</body>");
	resp.getWriter().println("</html>");
	}
}