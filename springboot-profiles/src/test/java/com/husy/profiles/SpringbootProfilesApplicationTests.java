package com.husy.profiles;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class SpringbootProfilesApplicationTests {
	@Value("${my.name}")
	String name;
	String sqldb;
	@Value("${my.sex}")
	String sex;
	@Value("${my.age}")
	Integer age;

	@Test
	void contextLoads() {
		System.out.println(name);
		System.out.println(sex);
		System.out.println(age);
	}


	@Autowired
	private Environment environment;
	@Test
	void contextLoads2() {
		System.out.println(environment.getProperty("my.name"));
		System.out.println(environment.getProperty("my.sex"));
		System.out.println(environment.getProperty("my.age"));
	}

	@Autowired
	ConfigBean configBean;

	@Test
	void contextLoads3() {
		System.out.println(configBean.getName());
		System.out.println(configBean.getSex());
		System.out.println(configBean.getAge());
	}
}
