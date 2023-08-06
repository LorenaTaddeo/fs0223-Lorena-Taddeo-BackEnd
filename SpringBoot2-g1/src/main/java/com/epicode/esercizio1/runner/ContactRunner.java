package com.epicode.esercizio1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.esercizio1.service.ContactService;

@Component
public class ContactRunner implements CommandLineRunner{

	@Autowired ContactService contactService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ContactRunner...");
		
		for (int i = 0; i < 10; i++) {
			contactService.createFakeContact();
		}
	
	}
}
