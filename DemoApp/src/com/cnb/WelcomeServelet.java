package com.cnb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WelcomeServelet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
//		req.setAttribute("verb", "loves");
//		
//		RequestDispatcher rd = req.getRequestDispatcher("love");
//		rd.forward(req, res);
		
//		String verb = "love";
//		res.sendRedirect("love?verb=" + verb);
		
		HttpSession session = req.getSession();
		session.setAttribute("verb", "loves");
		
		res.sendRedirect("love");
	}

}
