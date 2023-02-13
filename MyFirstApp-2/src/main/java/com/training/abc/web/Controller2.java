package com.training.abc.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller2 {
	@GetMapping("/sub/{a}/{b}")
	public ResponseEntity<Integer> doAdd1(@PathVariable int a,@PathVariable int b)
	{
		int sub = 0;
		sub = a-b;
		
		return new ResponseEntity<Integer>(sub,HttpStatus.OK);
	}

}
