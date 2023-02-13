package com.training.abc.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class Controller1 {
	
	@GetMapping("/add/{var1}/{var2}")
	public ResponseEntity<Integer> doAdd(@PathVariable int var1,@PathVariable int var2)
	{
		int sum = 0;
		sum = var1+var2;
		
		return new ResponseEntity<Integer>(sum,HttpStatus.OK);
	}
	

}
