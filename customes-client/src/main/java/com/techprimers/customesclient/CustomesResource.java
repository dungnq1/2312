package com.techprimers.customesclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/customer/hello/client")
public class CustomesResource {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public String hello() {
		System.out.println("dasdasd");
		String url = "http://customes-service/rest/customes/server";
		return restTemplate.getForObject(url, String.class);
	}
}
