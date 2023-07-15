package com.epicode.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class CatalogoBibliotecario {

	@Id
	private String codiceISBN;
	private String titolo;
	private Integer anno;
	private Integer numeroPagine;
	
	
	public CatalogoBibliotecario() {
		super();
	}

	public CatalogoBibliotecario(String codiceISBN, String titolo, Integer anno, Integer numeroPagine) {
		super();
		this.codiceISBN = codiceISBN;
		this.titolo = titolo;
		this.anno = anno;
		this.numeroPagine = numeroPagine;
	}


	public String getCodiceISBN() {
		return codiceISBN;
	}

	public void setCodiceISBN(String codiceISBN) {
		this.codiceISBN = codiceISBN;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public Integer getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "CatalogoBibliotecario [codiceISBN=" + codiceISBN + ", titolo=" + titolo + ", anno=" + anno
				+ ", numeroPagine=" + numeroPagine + "]";
	}
	
	
}
