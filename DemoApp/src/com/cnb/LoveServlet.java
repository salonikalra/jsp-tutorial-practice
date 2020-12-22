package com.cnb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/love")
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
		
//		ServletConfig con = getServletConfig();
//		String message = con.getInitParameter("message");
//		res.getWriter().println(message);
		
//		res.getWriter().println("Redirected to LoveServlet Using sendRedirect() and Annotations");
		
		HttpSession session = req.getSession();
		session.setAttribute("message", "Redirected from LoveServlet, with session "
				+ "object attached, message displayed "
				+ "using Expression Language");
		
		Student s = new Student("Saloni", 1);
		session.setAttribute("student", s.name);
		
		res.sendRedirect("EL.jsp");
	}

}
