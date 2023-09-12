package com.learningspring.online.LearnSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestLearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.from(LearnSpringBootApplication::main).with(TestLearnSpringBootApplication.class).run(args);
	}

}
