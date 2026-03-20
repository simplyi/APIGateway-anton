package com.appsdeveloperblog.photoapp.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		System.out.println("ApiGatewayApplication main method was called");
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
