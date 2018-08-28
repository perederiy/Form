package org.itstep;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class StartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String pages = "/WEB-INF/pages/MyPages.html";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher(pages).forward(request, response);
	}

}
