package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("product id " + id + " product name " + name);
		printWriter.println("<form action='second'>");
		printWriter.println("<input type='hidden' name='id' value='" + id + "'>");
		printWriter.println("<button type='submit'>Submit</button>");

	}

}
