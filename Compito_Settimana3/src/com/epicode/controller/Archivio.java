package com.epicode.controller;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.epicode.enumerated.Periodicita;
import com.epicode.model.CatalogoBibliotecario;
import com.epicode.model.Libri;
import com.epicode.model.Prestito;
import com.epicode.model.Riviste;
import com.epicode.model.Utente;

public class Archivio {

	static EntityManager em = Persistence.createEntityManagerFactory("Compito_Settimana3").createEntityManager();
	
	public static void main(String[] args) {

		try {
			Libri l1 = new Libri("101", "Diario di una schiappa", 2008, 105, "Jeff Kinney", "Commedia");
			//Libri l2 = new Libri(null, null, null, null, null, null);
			
			Riviste r1 = new Riviste("201", "Vogue", 2021, 30, Periodicita.MENSILE);
			//Riviste r2 = new Riviste(null, null, null, null, null);
			
			Utente u1 = new Utente("Giovanni", "Pierino", LocalDate.of(1980,12,19), 15622);
			Utente u2 = new Utente("Piero", "Giovannino", LocalDate.of(1962,7,6), 12873);
			//Utente u3 = new Utente(null, null, null, null);
			
			Prestito p1 = new Prestito(u1, l1, LocalDate.of(2023,11,2), LocalDate.of(2023,11,12));
			Prestito p2 = new Prestito(u2, r1 , LocalDate.of(2022,8,20), null);
			//Prestito p3 = new Prestito(null, null, null, null);
			
			
			//save(r1);
			//saveUtente(u2);
			//savePrestito(p2);
			//delete("201");
			//searchISBN("101");
			//searchAnno(2021);
			//searchAutore("Jeff Kinney");
			//searchTitolo("V");
			//searchElementiPrestati(15622);
			searchPrestitiScaduti(LocalDate.of(2023,8,20));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void save (CatalogoBibliotecario c) throws SQLException {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		System.out.println("Salvato!");
	}
	
	public static void saveUtente (Utente u) throws SQLException {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println("Utente Salvato!");
	}
	
	public static void savePrestito (Prestito p) throws SQLException {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println("Prestito Salvato!");
	}
	
	public static void delete(String codiceISBN) throws SQLException {
		em.getTransaction().begin();
		CatalogoBibliotecario x = em.find(CatalogoBibliotecario.class, codiceISBN);
		em.remove(x);
		em.getTransaction().commit();
		System.out.println(x.getTitolo() + " tolto dal Catalogo!");
	}
	
	public static void searchISBN(String codiceISBN) throws SQLException {
		em.getTransaction().begin();
		CatalogoBibliotecario x = em.find(CatalogoBibliotecario.class, codiceISBN);
		em.getTransaction().commit();
		System.out.println(x.getTitolo() + " TROVATO!");
	}
	
	public static void searchAnno(Integer anno) throws SQLException {
		Query query = em.createQuery("SELECT a FROM CatalogoBibliotecario a WHERE a.anno = :anno");
		query.setParameter("anno", anno);
		List<CatalogoBibliotecario> resultList = query.getResultList();
		resultList.forEach(el -> System.out.println(el));
	}
	
	public static void searchAutore(String autore) throws SQLException {
		Query query = em.createQuery("SELECT a FROM CatalogoBibliotecario a WHERE a.autore = :autore");
		query.setParameter("autore", autore);
		List<CatalogoBibliotecario> resultList = query.getResultList();
		resultList.forEach(el -> System.out.println(el));
	}
	
	public static void searchTitolo(String titolo) throws SQLException {
		Query query = em.createQuery("SELECT t FROM CatalogoBibliotecario t WHERE t.titolo LIKE :titolo");
		query.setParameter("titolo", "%" + titolo + "%");
		List<CatalogoBibliotecario> resultList = query.getResultList();
		resultList.forEach(el -> System.out.println(el));
	}
	
	public static void searchElementiPrestati(Integer numeroTessera) throws SQLException {
		Query query = em.createQuery("SELECT p FROM Prestito p WHERE p.utente.numeroTessera = :numTessera");
		query.setParameter("numTessera", numeroTessera);
		List<Prestito> resultList = query.getResultList();
		resultList.forEach(el -> System.out.println(el));
	}
	
	public static void searchPrestitiScaduti(LocalDate data) throws SQLException {
		Query query = em.createQuery("SELECT s FROM Prestito s WHERE s.dataRestituzionePrevista < :data AND s.dataRestituzioneEffettiva IS NULL");
		query.setParameter("data", data);
		List<Prestito> resultList = query.getResultList();
		resultList.forEach(el -> System.out.println(el));
	}

}
