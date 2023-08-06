package com.epicode.esercizio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.epicode.esercizio1.classes.Contact;
import com.epicode.esercizio1.service.ContactService;

@Controller
public class ContactController {

	@Autowired ContactService contactService;
		
	//	@GetMapping("/")
	//	public @ResponseBody String getHomeTest() {
	//		return "Home page test!!!";
	//	}
	
	@GetMapping("/")
	public String getHome() {
		return "home";
	}
	
	@GetMapping("/rubrica")
	public ModelAndView getRubrica() {
		List<Contact> listaContatti = contactService.getAllContacts();
		//System.out.println(listaContatti.size());
		//listaContatti.forEach(c -> System.out.println(c));
		ModelAndView model = new ModelAndView("rubrica"); // nome della pagina html che voglio richiamare
		model.addObject("lista", listaContatti);
		return model;
	}
	
	@GetMapping("/contact")
	public String getContatto() {
		return "/contact";
	}
	
	/*@GetMapping("/contact/{name}/{lastname}/{city}/{age}/{email}")
	public ModelAndView getContact(
									@PathVariable String name, 
									@PathVariable String lastname, 
									@PathVariable String city, 
									@PathVariable String age, 
									@PathVariable String email
									) {
		ModelAndView model = new ModelAndView("Contact");
		model.addObject("myName", name);
		model.addObject("myLastname", lastname);
		model.addObject("myCity", city);
		model.addObject("myAge", age);
		model.addObject("myEmail", email);
		return model;
	}*/
}
