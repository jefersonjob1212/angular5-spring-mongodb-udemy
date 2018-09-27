package com.jefersonjob.firstspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstSpringBootController {
	
	@RequestMapping("/")
	public String index() {
		return "index page";
	}

	@RequestMapping("/showtext")
	public String showText()
	{
		return "Hello, first Spring Boot project";
	}
}
