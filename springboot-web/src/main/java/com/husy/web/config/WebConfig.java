package com.husy.web.config;

import com.husy.web.interceptor.IndexInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @description: 启动时加载配置
 * @author: husy
 * @date 2020/1/13
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Autowired
	private IndexInterceptor indexInterceptor;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("------------------准备注册拦截器---------------");

		// addPathPatterns("/**") 表示拦截所有的请求，
		// excludePathPatterns("/login", "/register") 表示除了登陆与注册之外，因为登陆注册不需要登陆也可以访问
		registry.addInterceptor(indexInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns("/login", "/register");
	}
}
