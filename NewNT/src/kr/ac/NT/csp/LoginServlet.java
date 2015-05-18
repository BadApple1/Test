package kr.ac.NT.csp;

import java.io.IOException;
import java.util.List;

import javax.jdo.Query;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet  extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String userid = req.getParameter("userID");
		String password = req.getParameter("password");
		boolean success = false;
		
		
		List<UserAccount> userAccount = MemberManager.Login(userid);
		
		
		

		if(userAccount.size()==0)
		{
			success=false;
		}
		
		else if(userAccount.get(0).getPassword().equals(password))
		{
			success=true;
		}
		
		else
		{
			success=false;
		}

		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");

		if(!success)
		{
			resp.getWriter().println("Fail to login");
			resp.getWriter().println("<a href='login.html'>Login Again</a>");
		}
		
		if(success)
		{
			resp.sendRedirect("/index.html");
		}
		
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");

	}

}
