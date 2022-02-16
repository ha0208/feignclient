package com.example.springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/name")
	public String getName() {
		return "Harshita !";
				
	}
	
	@GetMapping("/address")
	public String getAddress() {
		return "Ameerpet !";
				
	}
	  
	@GetMapping("/branch")
	public String getBranch() {
		return "CSE!";
				
	}
    
	
}
