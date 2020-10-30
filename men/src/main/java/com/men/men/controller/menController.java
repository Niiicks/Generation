package com.men.men.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/men")
public class menController {
	@GetMapping
	public String men(){
		return "Meu objetivo de aprendizagem é aprender trabalhar o backend com banco de dados";
	}
}
