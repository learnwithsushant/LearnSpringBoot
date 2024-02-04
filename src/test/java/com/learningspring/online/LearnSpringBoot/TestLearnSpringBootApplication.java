package com.learningspring.online.LearnSpringBoot;

import com.learningspring.online.LearnSpringBoot.udemy.LearnSpringBootApplicationTests;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestLearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.from(LearnSpringBootApplication::main).with(LearnSpringBootApplicationTests.class).run(args);
	}

}
