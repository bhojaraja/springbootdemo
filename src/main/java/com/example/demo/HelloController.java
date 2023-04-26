package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping("/")
	public String hello()
	{
		return " welcome to Jenkin Demo";
	}

@GetMapping("/welcome")
public String hello2()
{
	return " welcome to Jenkin Training .This is a sample restful Services";
}
}


