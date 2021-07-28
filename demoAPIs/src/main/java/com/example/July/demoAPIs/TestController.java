package com.example.July.demoAPIs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/helloAPI")
	public String hello() {
		return "hello";
				
	}
}
