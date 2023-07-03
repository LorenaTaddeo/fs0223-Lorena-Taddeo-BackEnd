package com.epicode.banca;

public class BancaException extends Exception {
	
	public BancaException(String messaggio){
		super(messaggio);
	}
	
	public String toString() {
		return this.getMessage();
	}

}
