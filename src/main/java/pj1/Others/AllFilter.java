package pj1.Others;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import pj1.Model.Admin;

public class AllFilter implements Filter {
	
	private Admin admin;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		Object req=request.getAttribute("adminId");
		
		if(req.equals(admin))
		
		chain.doFilter(request, response);
		
	}

}
