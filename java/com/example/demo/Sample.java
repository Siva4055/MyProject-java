package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
    
	@RequestMapping("/hello/greetings")
	public String m1(@RequestParam String bhayya) {
		return "hello  " + bhayya + " h r u  ";
		 
	}
	
	
	
}
