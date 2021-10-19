package com.gitsbp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/printdata")
	public ResponseEntity<String> showPrinted() {
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}
}