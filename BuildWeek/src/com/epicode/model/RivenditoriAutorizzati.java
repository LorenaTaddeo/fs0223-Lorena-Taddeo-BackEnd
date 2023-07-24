package com.epicode.model;

import javax.persistence.Entity;

@Entity
public class RivenditoriAutorizzati extends PuntoVendita {

	public RivenditoriAutorizzati() {
		super();
	}

	@Override
	public String toString() {
		return "RivenditoriAutorizzati " + super.toString();
	}

	
	
}
