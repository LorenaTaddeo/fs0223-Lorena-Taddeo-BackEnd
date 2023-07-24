package com.epicode.model;

import javax.persistence.Entity;

@Entity
public class DistributoriAutomatici extends PuntoVendita {

	private boolean attivo;

	public DistributoriAutomatici() {
		super();
	} 
	
	public DistributoriAutomatici(boolean attivo) {
		super();
		this.attivo = attivo;
	}

	public boolean isAttivo() {
		return attivo;
	}

	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}

	@Override
	public String toString() {
		return "DistributoriAutomatici [attivo=" + attivo + "]";
	}
	
	
}
