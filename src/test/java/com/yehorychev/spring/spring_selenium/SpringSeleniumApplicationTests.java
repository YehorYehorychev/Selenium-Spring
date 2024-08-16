package com.yehorychev.spring.spring_selenium;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringSeleniumApplicationTests {

	@Autowired
	private User user;

	@Value("${PATH}")
	private String path;

	@Value("${spring.application.name}")
	private List<String> appName;

	@Test
	void contextLoads() {
		System.out.println(this.appName);
		System.out.println(this.appName.size());
	}
}
