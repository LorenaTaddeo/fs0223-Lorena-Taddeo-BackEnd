package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utente {
	
	private String nome;
	private String cognome;
	
	@Column(name = "data_nascita")
	private LocalDate dataNascita;
	
	@Id
	@Column(unique = true, name = "numero_tessera")
	private Integer numeroTessera;
	
	public Utente() {
		super();
	}

	public Utente(String nome, String cognome, LocalDate dataNascita, Integer numeroTessera) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.numeroTessera = numeroTessera;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Integer getNumeroTessera() {
		return numeroTessera;
	}

	public void setNumeroTessera(Integer numeroTessera) {
		this.numeroTessera = numeroTessera;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + ", numeroTessera="
				+ numeroTessera + "]";
	}
	
	
	
	

}
