package com.uds.losdbuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class LosDbUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(LosDbUserApplication.class, args);
	}

}
