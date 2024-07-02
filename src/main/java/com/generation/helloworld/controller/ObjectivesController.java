package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")

public class ObjectivesController {
	
	@GetMapping
		public String obj() {
		return "Aprender a Usar Spring Tools";
	}

}
