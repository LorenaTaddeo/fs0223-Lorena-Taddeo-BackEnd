package com.epicode.esercizi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



//Dopo aver creato le classi, creo la classe Main
public class MainProject {
	
	//1)Creo una lista di prodotti
	static List<Product> listaProdotti = new ArrayList<Product>();
	
	//2)Creo una lista di ordini
	static List<Order> listaOrdini = new ArrayList<Order>();

	public static void main(String[] args) {
		
		//3) Creo i prodotti che aggiungerò alla lista dei prodotti
		Product p1 = new Product(1l, "Topolino", "Boys", 40.0);
		Product p2 = new Product(2l, "USAUniversity", "Books", 150.0);
		Product p3 = new Product(3l, "Biberon", "Baby", 30.0);
		Product p4 = new Product(4l, "Passeggino", "Baby", 149.0);
		Product p5 = new Product(5l, "Il cavaliere d'inverno", "Books", 120.0);
		Product p6 = new Product(6l, "T-shirt", "Boys", 20.0);
		
		//4)Aggiungo i prodotti alla listaProdotti
		listaProdotti.add(p1);
		listaProdotti.add(p2);
		listaProdotti.add(p3);
		listaProdotti.add(p4);
		listaProdotti.add(p5);
		listaProdotti.add(p6);
	
		//5)Creo i customer che compreranno i prodotti
		Customer c1 = new Customer(1l, "Giovanni", 1);
		Customer c2 = new Customer(2l, "Matteo", 2);
		Customer c3 = new Customer(3l, "Elisa", 3);
		Customer c4 = new Customer(4l, "Benny", 4);
		
		//6)Creo gli ordini effettuati da aggiungere alla lista degli ordini
		Order o1 = new Order(1l, "Consegnato", LocalDate.of(2021, 1, 23), LocalDate.of(2021, 1, 30), Arrays.asList(p1, p4, p5), c1);
		Order o2 = new Order(2l, "In consegna", LocalDate.of(2021, 2, 16), LocalDate.of(2021, 2, 19), Arrays.asList(p3, p6), c2);
		Order o3 = new Order(3l, "Spedito", LocalDate.of(2021, 3, 23), LocalDate.of(2021, 4, 10), Arrays.asList(p1, p2), c3);
		Order o4 = new Order(4l, "Ordinato", LocalDate.of(2021, 5, 21), LocalDate.of(2021, 5, 30), Arrays.asList(p4, p5, p6), c4);
		Order o5 = new Order(5l, "Consegnato", LocalDate.of(2021, 11, 23), LocalDate.of(2021, 11, 30), Arrays.asList(p5, p6), c1);
		Order o6 = new Order(6l, "Spedito", LocalDate.of(2021, 6, 20), LocalDate.of(2021, 6, 25), Arrays.asList(p3, p4), c2);
		Order o7 = new Order(7l, "In consegna", LocalDate.of(2021, 3, 5), LocalDate.of(2021, 3, 15), Arrays.asList(p1, p5), c3);
		Order o8 = new Order(8l, "Consegnato", LocalDate.of(2021, 1, 15), LocalDate.of(2021, 1, 20), Arrays.asList(p2, p3, p4), c4);
		Order o9 = new Order(9l, "Ordinato", LocalDate.of(2021, 4, 2), LocalDate.of(2021, 4, 3), Arrays.asList(p2, p6), c1);
		Order o10 = new Order(10l, "Consegnato", LocalDate.of(2021, 7, 17), LocalDate.of(2021, 7, 31), Arrays.asList(p2, p3), c3);
		
		
		//7)Aggiungo gli ordini alla lista ordini
		listaOrdini.add(o1);
		listaOrdini.add(o2);
		listaOrdini.add(o3);
		listaOrdini.add(o4);
		listaOrdini.add(o5);
		listaOrdini.add(o6);
		listaOrdini.add(o7);
		listaOrdini.add(o8);
		listaOrdini.add(o9);
		listaOrdini.add(o10);
		
		//Stampiamo le liste
		System.out.println("Lista Prodotti");
		listaProdotti.forEach(p -> System.out.println(p));
		System.out.println("Lista Ordini");
		listaOrdini.forEach(o -> System.out.println(o));
	
		
		//Stampiamo i metodi
		System.out.println("Lista Prodotti categoria Books");
		List<Product> listaBooks100 = esercizio1(listaProdotti);
		listaBooks100.forEach(p -> System.out.println(p));
		
		System.out.println("Lista di ordini con prodotti che appartengono alla categoria Baby");
		List<Order> listaBaby = esercizio2(listaOrdini);
		listaBaby.forEach(o -> System.out.println(o));
		
		System.out.println("Lista Prodotti Boys scontati");
		List<Product> listaBoys = esercizio3(listaProdotti);
		listaBoys.forEach(p -> System.out.println(p));
		
		System.out.println("Lista prodotti ordinati da clienti di livello 2");
		List<Product> listaTier2 = esercizio4(listaOrdini);
		listaTier2.forEach(p -> System.out.println(p));

	}
	
	//8)Creo le funzioni per ogni esercizio
	//9)Il parametro delle funzioni viene richiesto dall'esercizio
	//  Richiede la lista di prodotti e inventiamo il nome
	public static List<Product> esercizio1(List<Product> allProducts) {
		//Ottenere una lista di prodotti che appartengono alla 
		//categoria «Books» ed hanno un prezzo > 100
		
		//Prendiamo il nome del parametro quindi la List e la streammiamo, trasformiamo una collection in una stream di dati
		//Filtriamo i prodotti per categoria e per prezzo come richiesto
		//Terminiamo con  collect che chiude uno stream e ne restituisce una collection
		//Dobbiamo farla ritornare quindi return
		return allProducts
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.filter(p -> p.getPrice() > 100)
				.collect(Collectors.toList());	
	}
	
	public static List<Order> esercizio2(List<Order> allOrders) {
		//Ottenere una lista di ordini con prodotti che appartengono 
		//alla categoria «Baby»
		
		//Trasformiamo una collection in una stream di dati
		//Filtriamo gli ordini dentro i quali abbiamo in ognuno una lista di prodotti
		//Trasformiamo le liste di prodotti interne agli ordini in una stream di dati
		//Con anyMatch andiamo a prendere gli ordini completi e non solo la categoria, cosa che fa filter
		//Prendiamo gli ordini con cateroria Baby
		//Terminiamo con collect che chiude uno stream e ne restituisce una collection
		//Dobbiamo farla ritornare quindi return
		return allOrders
				.stream()
				.filter(o ->
				o.getProducts()
						.stream()
						.anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
						)
				.collect(Collectors.toList());
			
	}
	
	public static List<Product> esercizio3(List<Product> allProductsBoys) {
		//Ottenere una lista di prodotti che appartengono alla 
		//categoria «Boys» ed applicare 10% di sconto al loro prezzo
		
		//Trasformiamo una collection in una stream di dati
		//Filtriamo i prodotti con categoria Boys
		//Map serve per MODIFICARE OGNI ELEMENTO dello stream
		//Quindi modifichiamo il prezzo con set e con get lo prendiamo
		//Per completarlo dobbiamo far ritornare p modificato
		//Terminiamo con collect che chiude uno stream e ne restituisce una collection
		//Dobbiamo farla ritornare quindi return
		
		return allProductsBoys
					.stream()
					.filter(p -> p.getCategory().equalsIgnoreCase("Boys"))
					.map(p -> {
						p.setPrice(p.getPrice() * 0.9);
						return p;
					})
					.collect(Collectors.toList());
				
	}
	
	public static List<Product> esercizio4(List<Order> allOrders2 ) {
		//Ottenere una lista di prodotti ordinati da clienti di 
		//livello (tier) 2 tra l’01-Feb-2021 e l’01-Apr-2021
		
		//Trasformiamo una collection in una stream di dati
		//Filtriamo gli ordini con Customer Tier uguale a 2
		//Filtriamo gli ordini effettuati dopo il 1-02-2021
		//Filtriamo gli ordini effettuati prima del 1-04-2021
		//flatMap produce un flusso di nuovi valori, quindi prendiamo i prodotti degli ordini e li trasformiamo in una stream di dati
		//Distinct fa sì che non venga ripetuto lo stesso valore
		//Terminiamo con collect che chiude uno stream e ne restituisce una collection
		//Dobbiamo farla ritornare quindi return
		
		return allOrders2
					.stream()
					.filter(o -> o.getCustomer().getTier() == 2)
					.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
					.filter(o ->o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
					.flatMap(o -> o.getProducts().stream())
					.distinct()
					.collect(Collectors.toList());
			}

}
