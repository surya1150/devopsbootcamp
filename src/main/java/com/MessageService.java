package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {
			
	@GetMapping("/welcome")
	public String sayHello() {
		return "Welcome to Spring boot Demo";
	}
	@GetMapping("/admin")
	public String adminPage() {
		return "Welcome Admin";
	}
	@GetMapping("/guest")
	public String guestPage() {
		return "Welcome Guest";
	}
	
	
	
}