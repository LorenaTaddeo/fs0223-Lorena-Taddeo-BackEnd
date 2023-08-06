package com.epicode.progetto.prenotazioni.models;

import jakarta.persistence.Entity;
import lombok.Builder;

@Entity
@Builder
public class Smartphone extends Dispositivo{
	
	public Smartphone() {
		super();
	}

	public Smartphone(Utente utente) {
		super(utente);
	}

	
}
