package com.gitsbp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gitsbp.model.GitSpringdata;
import com.gitsbp.service.GitProjService;

@RestController
//@RequestMapping("/hello")
public class HelloController {

	@Autowired
	GitProjService gitProjService;

	@GetMapping("/printdata")
	public ResponseEntity<String> showPrinted() {
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}

	@PostMapping("/saveData")
	public ResponseEntity<GitSpringdata> savePrintedData(@RequestBody GitSpringdata gitSpringdata) {
		GitSpringdata gitSpringdatatemp = gitProjService.saveGitProjData(gitSpringdata);
		return new ResponseEntity<GitSpringdata>(gitSpringdatatemp, HttpStatus.OK);
	}
}