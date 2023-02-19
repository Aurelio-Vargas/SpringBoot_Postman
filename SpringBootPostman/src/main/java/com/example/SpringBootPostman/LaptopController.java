package com.example.SpringBootPostman;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
	
	private LaptopRepository laptopRepository;
	
	public LaptopController(LaptopRepository laptopRepository) {
		this.laptopRepository=laptopRepository;
	}
	@GetMapping("/api/laptop")
	public List<Laptop> findAll(){
		return laptopRepository.findAll();
	}
	
	public ResponseEntity<Laptop> findOneById(@PathVariable Long id){
		Optional<Laptop> laptopOpt = laptopRepository.findById(id);
		
		if(laptopOpt.isPresent())
			return ResponseEntity.ok(laptopOpt.get());
		else
			return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/api/laptops")
	public Laptop create (@RequestBody Laptop laptop) {
		return laptopRepository.save(laptop);
	}
	


}
