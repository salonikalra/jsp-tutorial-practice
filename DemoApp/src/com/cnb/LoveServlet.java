package com.cnb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoveServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
//		String fname = req.getParameter("fname");
//		String lname = req.getParameter("lname");

//		String verb = (String) req.getAttribute("verb");
		
//		String verb = req.getParameter("verb");
		
//		HttpSession session = req.getSession();
//		String verb =  (String) session.getAttribute("verb");
//		res.getWriter().println(verb);
		
//		String message = null;
//		Cookie cookies[] = req.getCookies();
//		for(Cookie c : cookies) {
//			if(c.getName().equals("message")) {
//				message = c.getValue();
//			}
//		}

//		ServletContext cntx = getServletContext();
//		String message = cntx.getInitParameter("message");
		
		ServletConfig con = getServletConfig();
		String message = con.getInitParameter("message");
		
		res.getWriter().println(message);
		
	}

}
