package com.example.pizzeria.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.pizzeria.classes.Edificio;
import com.example.pizzeria.classes.Utente;
import com.example.pizzeria.repository.UtenteRepo;

@Service
public class UtenteService {

	@Autowired UtenteRepo utenteRepo;
	@Autowired @Qualifier("generaUtente") private ObjectProvider<Utente> utenteProvider;
	
	public Utente creaUtente(String username, String nomecompleto, String email ) {
		return utenteProvider.getObject().builder()
				.username(username)
				.nomecompleto(nomecompleto)
				.email(email)
				.build();
	}
	
	public void salvaUtente(Utente u) {
		utenteRepo.save(u);
		System.out.println(u);
	}
	
	public Utente trovaUtenteId(String nome) {
		return utenteRepo.findById(nome).get();
	}
}
