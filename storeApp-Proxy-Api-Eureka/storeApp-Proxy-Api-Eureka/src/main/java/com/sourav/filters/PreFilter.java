package com.sourav.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		
		//return true goes to next preFilter else not
		return true;
	}

	//preFilter
	@Override
	public Object run() throws ZuulException {
		RequestContext requestContext = RequestContext.getCurrentContext();
		HttpServletRequest httpServletRequest = requestContext.getRequest();
		
		System.out.println("--------------------In Pre Filter Method--------------------------");
		System.out.println("\n Request Method : " + httpServletRequest.getMethod() + "\n Request URL :" + httpServletRequest.getRequestURI().toString());
		System.out.println("----------------------------------------------");
		
		return null;
	}

	@Override
	public String filterType() {
		// return String  pre for the preFilter
		return "pre";
	}

	@Override
	public int filterOrder() {
		//lower the order first prefence is given
		return 0;
	}

}
