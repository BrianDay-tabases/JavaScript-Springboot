package com.example.homebuyer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.homebuyer.beans.Home;
import com.example.homebuyer.services.HomeService;

//web requests
@RestController
@CrossOrigin(origins = "http://localhost:4200")  //this circumvents the CORS errors, Cross Origin is there to protect injections from JavaScript front end to back end
public class HomeController {

	@Autowired //finds homeservice and injects it below... aka dependency injection
	private HomeService service;
	
	public HomeController() {
		System.out.println("Controller Created");
	}
	
	@PostMapping("/homebuyer/homes")
	public ResponseEntity<Home> save(@RequestBody Home home) {
		System.out.println("POST called");
		return new ResponseEntity<>(service.save(home), HttpStatus.CREATED);
	}
	
	@GetMapping("/homebuyer/homes")
	public ResponseEntity<List<Home>> findAll() {
		System.out.println("GET called");
		return new ResponseEntity<List<Home>>(service.findAll(), HttpStatus.OK); // passes all the homes in the list via the HTTP's body content
	}
}
