package com.cnb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoveServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		res.getWriter().println(fname + " loves " + lname);
		
	}

}
