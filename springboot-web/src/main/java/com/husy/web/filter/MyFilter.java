package com.husy.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @description: TODO
 * @author: husy
 * @date 2020/1/13
 */
@WebFilter(filterName="myFilter",urlPatterns="/*")
public class MyFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//返回<filter-name>元素的设置值。
		System.out.println("getFilterName:"+filterConfig.getFilterName());
		//返回FilterConfig对象中所包装的ServletContext对象的引用。
		System.out.println("getServletContext:"+filterConfig.getServletContext());
		//用于返回在web.xml文件中为Filter所设置的某个名称的初始化的参数值
		System.out.println("getInitParameter:"+filterConfig.getInitParameter("cacheTimeout"));
		//返回一个Enumeration集合对象。
		System.out.println("getInitParameterNames:"+filterConfig.getInitParameterNames());
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
		System.out.println("-------------进入过滤器中，开始过滤处理");
		filterChain.doFilter(request,response);
	}

	@Override
	public void destroy() {

	}
}