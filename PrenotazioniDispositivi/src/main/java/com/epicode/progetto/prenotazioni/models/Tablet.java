package com.epicode.progetto.prenotazioni.models;

import jakarta.persistence.Entity;
import lombok.Builder;

@Entity
@Builder
public class Tablet extends Dispositivo{

	public Tablet() {
		super();
	}

	public Tablet(Utente utente) {
		super(utente);
	}
	
	
}
