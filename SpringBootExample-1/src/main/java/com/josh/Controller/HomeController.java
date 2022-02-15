package com.josh.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/sayHello")
	public String sayHello()
	{
		return "Hello";
	}
	
}

