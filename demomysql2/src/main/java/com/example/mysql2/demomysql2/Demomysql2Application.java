package com.example.mysql2.demomysql2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.mysql2.demomysql2.controller.UserRepository.class")
public class Demomysql2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demomysql2Application.class, args);
	}

}
