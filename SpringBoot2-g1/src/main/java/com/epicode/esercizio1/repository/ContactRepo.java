package com.epicode.esercizio1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.esercizio1.classes.Contact;

@Repository
public interface ContactRepo extends CrudRepository<Contact, Long>{


}
