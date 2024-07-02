package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {

	
	@GetMapping
		public String bsm() {
		return "Mentalidades:\r\n"
				+ "\r\n"
				+ "- de crescimento \r\n"
				+ "- ⁠responsabilidade pessoal\r\n"
				+ "- ⁠orientação ao futuro\r\n"
				+ "- ⁠persistência \r\n"
				+ "\r\n"
				+ "Competências comportamentais:\r\n"
				+ "- Comunicação \r\n"
				+ "- ⁠Proatividade\r\n"
				+ "- ⁠Orientação ao detalhe \r\n"
				+ "- ⁠trabalho em equipe";
	}
}
