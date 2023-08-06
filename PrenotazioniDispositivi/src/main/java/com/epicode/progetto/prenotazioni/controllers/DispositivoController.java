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

import com.epicode.progetto.prenotazioni.models.Dispositivo;
import com.epicode.progetto.prenotazioni.models.Utente;
import com.epicode.progetto.prenotazioni.services.DispositivoService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/dispositivi")
public class DispositivoController {
	
	@Autowired DispositivoService dispositivoService;

	@GetMapping
	public ResponseEntity<List<Dispositivo>> getAll() {
		return new ResponseEntity<List<Dispositivo>>(dispositivoService.listaDispositivi(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Dispositivo> getDispositivoById(@PathVariable Long id) {
		return new ResponseEntity<Dispositivo>(dispositivoService.trovaDispositivoId(id), HttpStatus.OK);
	}
	
	@PostMapping("/add/laptop")
	  public ResponseEntity<String> newLaptop() {
	    dispositivoService.salvaDispositivo( dispositivoService.creaLaptop() );
	    return new ResponseEntity<String>("Nuovo Laptop aggiunto!", HttpStatus.OK);
	}
	
	@PostMapping("/add/smartphone")
	  public ResponseEntity<String> newSmartphone() {
	    dispositivoService.salvaDispositivo( dispositivoService.creaSmartphone() );
	    return new ResponseEntity<String>("Nuovo Smartphone aggiunto!", HttpStatus.OK);
	}
	
	@PostMapping("/add/tablet")
	  public ResponseEntity<String> newTablet() {
	    dispositivoService.salvaDispositivo( dispositivoService.creaTablet() );
	    return new ResponseEntity<String>("Nuovo Tablet aggiunto!", HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public void aggiornaUtente(@PathParam(value = "username") String username, @PathVariable Long id) {
		dispositivoService.assegnaUtente(username, id);
		System.out.println("Utente assegnato");
	}
	
	@PutMapping
	public ResponseEntity<Dispositivo> aggiornaDispositivo(@RequestBody Dispositivo dispositivo) {
			dispositivoService.salvaDispositivo(dispositivo);
			return new ResponseEntity<Dispositivo>(dispositivo, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Dispositivo> removeDispoById(@PathVariable Long id) {
		Dispositivo d = dispositivoService.trovaDispositivoId(id);
		dispositivoService.eliminaDispositivo(id);
		return new ResponseEntity<Dispositivo>(d, HttpStatus.OK);
	}
}
