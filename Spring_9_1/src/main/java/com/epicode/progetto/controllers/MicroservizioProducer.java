package com.epicode.progetto.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.progetto.models.User;

@RestController
@RequestMapping("/api/app")
public class MicroservizioProducer {

	// Controller di endpoint invocati da un altro microservizio
	
		@GetMapping("/data1")
		public String testTxt() {
			return "BE String Content";
		}
		
		@GetMapping("/data2")
		public ResponseEntity<List<User>> testUsers() {
			List<User> users = new ArrayList<User>();
			users.add(new User("Mario", "Rossi", "Roma"));
			users.add(new User("Giuseppe", "Verdi", "Milano"));
			users.add(new User("Francesca", "Neri", "Napoli"));
			users.add(new User("Alessia", "Bianchi", "Firenze"));
			return new ResponseEntity<List<User>>(users, HttpStatus.OK);
		}
}
