package com.epicode.progetto.prenotazioni.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.progetto.prenotazioni.models.Utente;
import com.epicode.progetto.prenotazioni.services.UtenteService;

@RestController
@RequestMapping("/api/utenti")
public class UtenteController {

	@Autowired UtenteService utenteService;
	
	@GetMapping
	public ResponseEntity<List<Utente>> getAll() {
		return new ResponseEntity<List<Utente>>(utenteService.listaUtenti(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Utente> getUtenteById(@PathVariable String id) {
		return new ResponseEntity<Utente>(utenteService.trovaUtenteId(id), HttpStatus.OK);
	}
	
	@PostMapping
	public void newUtente(@RequestBody Utente utente) {
		utenteService.salvaUtente(utente);
	}
	
	@PutMapping
	public ResponseEntity<Utente> aggiornaUtente(@RequestBody Utente utente) {
			utenteService.salvaUtente(utente);
			return new ResponseEntity<Utente>(utente, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Utente> removeUtenteById(@PathVariable String id) {
		Utente u = utenteService.trovaUtenteId(id);
		utenteService.eliminaUtente(id);
		return new ResponseEntity<Utente>(u, HttpStatus.OK);
	}

}
