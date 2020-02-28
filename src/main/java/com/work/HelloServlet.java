package com.work;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

public class HelloServlet extends HttpServlet {

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
//		super.doGet(req, resp);

		ApplicationContext ac = (ApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);

		HelloService bean = ac.getBean(HelloService.class);

		System.out.println("doGet");

		resp.getWriter().println("<html>");
		resp.getWriter().println("<head>");
		resp.getWriter().println("</head>");
		resp.getWriter().println("<body>");
		// resp.getWriter().println("<h1>hello servlet " + getServletContext().getAttribute("name").toString() + "</h1>");
		resp.getWriter().println("<h2>ioc bean : " + bean.getName() + "</h2>");
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
