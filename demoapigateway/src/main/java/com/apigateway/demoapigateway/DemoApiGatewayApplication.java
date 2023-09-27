package com.apigateway.demoapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApiGatewayApplication.class, args);
	}

}
