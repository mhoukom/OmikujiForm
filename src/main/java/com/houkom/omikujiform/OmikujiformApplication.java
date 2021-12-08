package com.houkom.omikujiform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.houkom.omikuji.controllers"})
public class OmikujiformApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OmikujiformApplication.class, args);
	}
}
