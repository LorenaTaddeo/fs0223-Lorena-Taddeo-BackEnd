package com.example.pizzeria.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.pizzeria.classes.Utente;

public interface UtenteRepo extends CrudRepository<Utente, String>{

}
