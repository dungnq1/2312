package com.techprimers.customesclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class CustomesClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomesClientApplication.class, args);
	}

}

