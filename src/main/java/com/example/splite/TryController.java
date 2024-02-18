package com.example.splite;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping()
public class TryController {


	@GetMapping("/try")
	public String addNewUser() {

		return "try response success";

	}

	
}
