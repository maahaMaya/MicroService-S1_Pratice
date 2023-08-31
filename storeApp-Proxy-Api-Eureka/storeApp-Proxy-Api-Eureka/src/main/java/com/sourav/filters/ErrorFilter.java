package com.sourav.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class ErrorFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		//return true goes to next preFilter else not
		return true;
	}

	//preFilter
	@Override
	public Object run() throws ZuulException {		
		System.out.println("--------------------In Error Filter Method--------------------------");
		return null;
	}

	@Override
	public String filterType() {
		// return String  error for the preFilter
		return "error";
	}

	@Override
	public int filterOrder() {
		//lower the order first prefence is given
		return 0;
	}

}
