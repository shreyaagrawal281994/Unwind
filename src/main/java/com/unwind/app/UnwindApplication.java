package com.unwind.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class UnwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnwindApplication.class, args);
	}

}
