package com.kraft.spring_boot_kraft_docker2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mesaj")
public class MesajApi {

	
	@GetMapping
	public String mesajVer() {
		return "Merhaba Türk Telekom";
		
	}
}
