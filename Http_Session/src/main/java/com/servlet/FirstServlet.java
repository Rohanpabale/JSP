package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");

		HttpSession session = req.getSession();
		session.setAttribute("name", name);

		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("name " + name);
		printWriter.println("<a href='second'> Load Second Servlet</a>");
	}

}
