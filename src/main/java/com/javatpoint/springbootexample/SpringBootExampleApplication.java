package com.javatpoint.springbootexample;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootExampleApplication {

	@RequestMapping("/")  
	public String hello()   
	{  
	return "Hello javaTpoint";  
	}  

}
