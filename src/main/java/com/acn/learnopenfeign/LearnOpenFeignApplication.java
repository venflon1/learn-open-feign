package com.acn.learnopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LearnOpenFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnOpenFeignApplication.class, args);
	}
}