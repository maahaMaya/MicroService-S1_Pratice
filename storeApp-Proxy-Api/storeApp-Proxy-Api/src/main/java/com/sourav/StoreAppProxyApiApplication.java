package com.sourav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.sourav.filters.ErrorFilter;
import com.sourav.filters.PostFilter;
import com.sourav.filters.PreFilter;
import com.sourav.filters.RouteFilter;

@EnableZuulProxy
@SpringBootApplication
public class StoreAppProxyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreAppProxyApiApplication.class, args);
		System.out.println("Server started.....");
	}

    @Bean
    PreFilter getPreFilter() {
		return new PreFilter();
	}
	
	@Bean
	PostFilter getPostFilter() {
		return new PostFilter();
	}
	
	@Bean
	RouteFilter getRouteFilter() {
		return new RouteFilter();
	}
	
	@Bean
	ErrorFilter getErrorFilter() {
		return new ErrorFilter();
	}

}
