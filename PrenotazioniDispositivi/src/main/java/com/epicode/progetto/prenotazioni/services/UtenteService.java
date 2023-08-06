package com.epicode.progetto.prenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.progetto.prenotazioni.models.Utente;
import com.epicode.progetto.prenotazioni.repository.UtenteRepo;

@Service
public class UtenteService {

	@Autowired UtenteRepo utenteRepo;
	@Autowired @Qualifier("fakeUtenteBean") private ObjectProvider<Utente> utenteProvider;
	
	public Utente creaUtente() {
		return utenteProvider.getObject();
	}
	
	public void salvaUtente(Utente u) {
		utenteRepo.save(u);
		System.out.println(u);
	}
	
	public List<Utente> listaUtenti () {
		return (List<Utente>) utenteRepo.findAll();
	}
	
	public Utente trovaUtenteId(String id) {
		return utenteRepo.findById(id).get();
	}
	
	public void eliminaUtente(String id) {
		utenteRepo.deleteById(id);
	}
}
