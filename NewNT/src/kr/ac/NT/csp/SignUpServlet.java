package kr.ac.NT.csp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpServlet  extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String userid = req.getParameter("userID");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		UserAccount ua = MemberManager.SignUpUser(userid, password, name);
		
		resp.sendRedirect("login.html");
	}

}
