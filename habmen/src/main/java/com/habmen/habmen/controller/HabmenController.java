package com.habmen.habmen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habmen")
public class HabmenController {
	
	@GetMapping
	public String habmen() {
		return "Para a realização dessa atividade utilizei atenção aos detalhes e persistência!";
	}
	
}
