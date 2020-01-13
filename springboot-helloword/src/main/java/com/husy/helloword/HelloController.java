package com.husy.helloword;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 * @author: husy
 * @date 2020/1/13
 */
@RestController
public class HelloController {
	@RequestMapping("hello")
	public String hello(){
		return "Hello World";
	}
}
