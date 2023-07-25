package com.example.configuration;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.classes.Lemonade;
import com.example.demo.classes.Menu;
import com.example.demo.classes.PizzaHawaiian;
import com.example.demo.classes.PizzaMargherita;
import com.example.demo.classes.PizzaSalami;
import com.example.demo.classes.Water;
import com.example.demo.classes.Wine;

@Configuration
public class MenuConfiguration {
	
	@Bean
	@Scope("singleton") 
	public Menu menu() {
		Menu m = new Menu();
		
		m.getMenuPizza().add(pizzaMargherita());
		m.getMenuPizza().add(pizzaHawaiian());
		m.getMenuPizza().add(pizzaSalami());
		
		m.getMenuDrink().add(drinkLemonade());
		m.getMenuDrink().add(drinkWater());
		m.getMenuDrink().add(drinkWine());
		
		return m;
	}
	
	// bean Pizza
	
	@Bean
	@Scope("singleton")
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean
	@Scope("singleton")
	public PizzaHawaiian pizzaHawaiian() {
		return new PizzaHawaiian();
	}
	
	@Bean
	@Scope("singleton")
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}

	// bean Drink
	
	@Bean
	@Scope("singleton")
	public Lemonade drinkLemonade() {
		return new Lemonade();
	}
	
	@Bean
	@Scope("singleton")
	public Water drinkWater() {
		return new Water();
	}
	
	@Bean
	@Scope("singleton")
	public Wine drinkWine() {
		return new Wine();
	}

}
