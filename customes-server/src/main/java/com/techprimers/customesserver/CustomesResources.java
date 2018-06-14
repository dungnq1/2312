package com.techprimers.customesserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/customes/server")
public class CustomesResources {

	@GetMapping
	public String customes() {
		return "hellp world!";
	}
	
}
