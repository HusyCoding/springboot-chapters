package com.husy.web.listenter;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @description: 自定义监听器
 * @author: husy
 * @date 2020/1/13
 */
@WebListener
public class RequestListenter implements ServletRequestListener {
	@Override
	public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
		System.out.println("---------------------------->请求销毁监听器");
	}
	@Override
	public void requestInitialized(ServletRequestEvent servletRequestEvent) {
		System.out.println("---------------------------->请求创建监听器");
	}
}
