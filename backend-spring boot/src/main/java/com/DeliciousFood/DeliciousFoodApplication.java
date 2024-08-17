package com.DeliciousFood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.DeliciousFood")
@EnableJpaRepositories(basePackages="com.DeliciousFood.repository")
public class DeliciousFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliciousFoodApplication.class, args);
	}

}
