package com.husy.web.config;

import com.husy.web.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

/**
 * @description: TODO
 * @author: husy
 * @date 2020/1/13
 */
//@Configuration
public class FilterConfig {
	//	@Bean
	public FilterRegistrationBean filterRegistrationBean(){
		FilterRegistrationBean bean = new FilterRegistrationBean();
		bean.setFilter(new MyFilter());
		bean.addUrlPatterns("/*");
		return bean;
	}
}
