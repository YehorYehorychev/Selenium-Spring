package com.yehorychev.spring.spring_selenium;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumApplicationTests {

	// user, salary and address

	@Test
	void contextLoads() {
		Address address = new Address();
		Salary salary = new Salary();

		User user = new User(address, salary);
		user.printDetails();
	}

}
