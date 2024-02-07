package com.learningspring.online.LearnSpringBoot.udemy;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;


@ComponentScan(basePackages = "com.learningspring.online.LearnSpringBoot.Udemy.*")
@EntityScan("com.learningspring.online.LearnSpringBoot.Udemy.*")
@SpringBootTest
public
class LearnSpringBootApplicationTests {

	@Autowired
	public User user;

	@Autowired
	Address address;

	@Autowired
	Salary salary;

	@Value("Coding to keep up the continuity - 3/10/2023")
	private String actiontask;

	@Value("${PATH:/tomcat/default/bin}")
	private String path;

	@Value("${fruits}")
	private List<String> fruitBasket;

	@Autowired
	private Faker faker;
	@Autowired
	private LifeCyclePerformer lifeCyclePerformer;

	@Test
	void contextLoads() {
		user.printDetails();
		System.out.println("Path value"+path);
		System.out.println(actiontask);
		fruitBasket.forEach(System.out::println);

		System.out.println("----- Using Faker library -----");

		System.out.println(faker.name().firstName());

	}

	@Test
	void testPerfomer(){

		this.lifeCyclePerformer.startPerformance();
	}

	/*Address address = new Address("Annie Basant Road");
	Salary salary = new Salary();
	User user = new User(address,salary);
		user.printDetails();*/

}
