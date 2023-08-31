package com.sourav.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class PostFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		
		//return true goes to next preFilter else not
		return true;
	}

	//preFilter
	@Override
	public Object run() throws ZuulException {		
		System.out.println("--------------------In Post Filter Method--------------------------");
		return null;
	}

	@Override
	public String filterType() {
		// return String  post for the preFilter
		return "post";
	}

	@Override
	public int filterOrder() {
		//lower the order first prefence is given
		return 0;
	}

}
