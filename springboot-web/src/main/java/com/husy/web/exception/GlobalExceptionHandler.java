package com.husy.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 控制器全局建言
 * @author: husy
 * @date 2020/1/13
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	/**
	 * 全局异常捕捉处理
	 * @param ex
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Map errorHandler(Exception ex) {
		System.out.println("--------全局异常捕捉处理---------");
		Map map = new HashMap(2);
		map.put("code", 100);
		map.put("msg", ex.getMessage());
		//当然也可以直接返回ModelAndView等类型，然后跳转相应的错误页面，这都根据实际的需要进行使用
		return map;
	}
}
