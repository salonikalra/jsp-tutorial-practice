package com.cnb;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FilterTargetServlet")
public class FilterTargetServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String fname = (String) req.getParameter("fname");
		String lname = (String) req.getParameter("lname");
		res.getWriter().println(fname+ " " + lname + " is in servlet.");
	}
}
