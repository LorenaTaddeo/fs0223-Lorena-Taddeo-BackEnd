package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tessera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate emissione;
	private LocalDate scadenza;
	
	@OneToOne
	private Utenti utente;
	
	public Tessera() {
		super();
	}
	
	public Tessera(LocalDate emissione, Utenti utente) {
		super();
		this.emissione = emissione;
		this.scadenza = emissione.plusDays(365);
		this.utente = utente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getEmissione() {
		return emissione;
	}

	public void setEmissione(LocalDate emissione) {
		this.emissione = emissione;
	}

	public LocalDate getScadenza() {
		return scadenza;
	}

	public void setScadenza(LocalDate scadenza) {
		this.scadenza = scadenza;
	}

	public Utenti getUtente() {
		return utente;
	}

	public void setUtente(Utenti utente) {
		this.utente = utente;
	}

	@Override
	public String toString() {
		return "Tessera [id=" + id + ", emissione=" + emissione + ", scadenza=" + scadenza + ", utente=" + utente + "]";
	}
	
	
	
	

	
}
