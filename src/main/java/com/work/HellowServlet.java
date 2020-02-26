package com.work;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HellowServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8580862620119070397L;

	@Override
	public void init() throws ServletException {
		System.out.println("init");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);

		System.out.println("doGet");

		resp.getWriter().println("<html>");
		resp.getWriter().println("<head>");
		resp.getWriter().println("</head>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<h1>hello servlet</h1>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		// super.destroy();
		System.out.println("destory");
	}

}
