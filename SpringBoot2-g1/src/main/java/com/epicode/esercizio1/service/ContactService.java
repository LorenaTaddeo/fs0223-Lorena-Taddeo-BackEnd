package com.epicode.esercizio1.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.esercizio1.classes.Contact;
import com.epicode.esercizio1.repository.ContactRepo;

@Service
public class ContactService {

	@Autowired ContactRepo contactRepo;
	@Autowired @Qualifier("fakeContactBean") private ObjectProvider<Contact> contactProvider;

	public void createFakeContact() {
		Contact c = contactProvider.getObject();
		contactRepo.save(c);
	}
	
	public List<Contact> getAllContacts() {
		return (List<Contact>) contactRepo.findAll();
	}
}
