package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@GetMapping(value="/sayMsg")
	public String getInfo() {
		return "Welcome to spring boot with Docker ";
	}

}