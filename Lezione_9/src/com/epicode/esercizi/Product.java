package com.epicode.esercizi;

//Dopo aver creato il nuovo file Lezione_9 con all'interno:
//1) src di base
//2) lib, cartella che creo con all'interno i jar
//   che implemento con build
//3) file logback
//4) maven, selezionando la cartella, configuro e mi crea 
//   il file pom dove aggiungo le dependencies
//5)Creo il mio Package
//6)Creo le mie classi: Product, Customer, Order
//7)Ad ognuna metto le variabili che mi servono
//  Con Source genero il costruttore e i get e set
//  Inoltre sempre con Source genero toString()
//

public class Product {
	
	private Long id;
	private String name;
	private String category;
	private Double price;
	
	public Product(Long id, String name, String category, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	
	
	

}
