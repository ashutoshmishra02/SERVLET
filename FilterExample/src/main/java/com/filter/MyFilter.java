package com.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		System.out.println("Before filter ");
		//...
		//...
		
		arg2.doFilter(arg0, arg1);
		
		System.out.println("After servlet");
		//...
		//...
		
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Filter.super.init(filterConfig);
	}
    
}
