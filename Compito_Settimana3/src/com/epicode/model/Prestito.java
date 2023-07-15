package com.epicode.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Prestito implements Serializable{
	
	@Id
	@ManyToOne
	private Utente utente;
	
	@ManyToOne
	@JoinColumn(name = "elemento_prestato_id")
	private CatalogoBibliotecario elementoPrestato;
	
	@Column(name = "inizio_prestito")
	private LocalDate inizioPrestito;
	
	@Column(name = "data_restituzione_prevista")
	private LocalDate dataRestituzionePrevista;
	
	@Column(name = "data_restituzione_effettiva")
	private LocalDate dataRestituzioneEffettiva;
	
	public Prestito() {
		super();
	}

	public Prestito(Utente utente, CatalogoBibliotecario elementoPrestato, LocalDate inizioPrestito, LocalDate dataRestituzioneEffettiva) {
		super();
		this.utente = utente;
		this.elementoPrestato = elementoPrestato;
		this.inizioPrestito = inizioPrestito;
		this.dataRestituzionePrevista = inizioPrestito.plusDays(30);
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public CatalogoBibliotecario getElementoPrestato() {
		return elementoPrestato;
	}

	public void setElementoPrestato(CatalogoBibliotecario elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}

	public LocalDate getInizioPrestito() {
		return inizioPrestito;
	}

	public void setInizioPrestito(LocalDate inizioPrestito) {
		this.inizioPrestito = inizioPrestito;
	}

	public LocalDate getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}

	public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}

	public LocalDate getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}

	public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	@Override
	public String toString() {
		return "Prestito [utente=" + utente + ", elementoPrestato=" + elementoPrestato + ", inizioPrestito="
				+ inizioPrestito + ", dataRestituzionePrevista=" + dataRestituzionePrevista
				+ ", dataRestituzioneEffettiva=" + dataRestituzioneEffettiva + "]";
	}

}
