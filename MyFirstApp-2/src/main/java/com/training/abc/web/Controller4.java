package com.training.abc.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller4 {
	
	@GetMapping("/div/{c}/{d}")
	public ResponseEntity<Integer> doAdd1(@PathVariable int c,@PathVariable int d)
	{
		int div = 0;
		div = c/d;
		
		return new ResponseEntity<Integer>(div,HttpStatus.OK);
	}

}