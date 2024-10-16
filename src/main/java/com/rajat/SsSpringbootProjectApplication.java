package com.rajat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rajat.service.MyService;

@SpringBootApplication
public class SsSpringbootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsSpringbootProjectApplication.class, args);
	}

	@Bean
	public MyService getService() {
		return new MyService();
	}
}
