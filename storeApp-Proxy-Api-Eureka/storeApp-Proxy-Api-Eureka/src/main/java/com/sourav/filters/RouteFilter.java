package com.sourav.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class RouteFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		//return true goes to next preFilter else not
		return true;
	}

	//preFilter
	@Override
	public Object run() throws ZuulException {		
		System.out.println("--------------------In Route Filter Method--------------------------");
		return null;
	}

	@Override
	public String filterType() {
		// return String  route for the preFilter
		return "route";
	}

	@Override
	public int filterOrder() {
		//lower the order first prefence is given
		return 0;
	}

}
