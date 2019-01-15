package com.bc.example.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bc.example.web.response.dto.ProjectInfo;

@RestController
public class ExampleController {
	public static final Logger log = LoggerFactory.getLogger(ExampleController.class);
		
	@RequestMapping(method=RequestMethod.GET, path="/")
    public ResponseEntity<?> projectInfo() {
		log.debug("Example application");
		ProjectInfo pi = new ProjectInfo();
		pi.setProjectName("Example Application");
		pi.setVersion("0.0.1-SNAPSHOT");
		return new ResponseEntity<>(pi, HttpStatus.OK);
	}
}
