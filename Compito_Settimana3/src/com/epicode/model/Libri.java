package com.epicode.model;

import javax.persistence.Entity;

@Entity
public class Libri extends CatalogoBibliotecario {
	
	private String autore;
	private String genere;
	
	public Libri() {
		super();
	}
	
	public Libri(String codiceISBN, String titolo, Integer anno, Integer numeroPagine, String autore, String genere) {
		super(codiceISBN, titolo, anno, numeroPagine);
		this.autore = autore;
		this.genere = genere;
		}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return super.toString() + " Libri [autore=" + autore + ", genere=" + genere +"]";
	}

	
	
	

	

}
