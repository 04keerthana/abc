package com.training.abc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyFirstWebController1 {
	
	@GetMapping("20/1/23")
	public String sayHello()
	{
		return "20/1/23";
	}

}
