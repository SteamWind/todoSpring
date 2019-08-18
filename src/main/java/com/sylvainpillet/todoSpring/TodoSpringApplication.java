package com.sylvainpillet.todoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TodoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoSpringApplication.class, args);
	}

}
