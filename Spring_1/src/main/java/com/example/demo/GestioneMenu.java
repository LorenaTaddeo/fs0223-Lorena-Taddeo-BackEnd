package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.configuration.MenuConfiguration;
import com.example.demo.classes.Menu;


public class GestioneMenu {
	
	AnnotationConfigApplicationContext appContext;
	Menu menu;
	
	public GestioneMenu() {
		appContext = new AnnotationConfigApplicationContext(MenuConfiguration.class);
		menu = (Menu) appContext.getBean("menu");
	}
	
	public void stampaMenu() {
		System.out.println("*** Menu ***");
		System.out.println("Pizzas");
		
		menu.getMenuPizza().forEach(p -> System.out.println(p.getMenuLine()));
		
		System.out.println();
		
		System.out.println("Drink");
		
		menu.getMenuDrink().forEach(d -> System.out.println(d.getMenuLine()));
		
		System.out.println();
		
		System.out.println("*** FINE ***");
	}

}
