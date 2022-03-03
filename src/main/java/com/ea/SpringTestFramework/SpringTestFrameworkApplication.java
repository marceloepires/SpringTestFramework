package com.ea.SpringTestFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTestFrameworkApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringTestFrameworkApplication.class, args);
		var car = applicationContext.getBean(com.ea.SpringTestFramework.Car.class);
		car.getCar();
	}

}
