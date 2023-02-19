package com.example.SpringBootPostman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hola")
	public String HolaMundo() {
		return "Hola a todos";
	}

}
