package com.example.demo.classes;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	private List<Pizza> menuPizza = new ArrayList<Pizza>();
	private List<Drink> menuDrink = new ArrayList<Drink>();
	
	public List<Pizza> getMenuPizza() {
		return menuPizza;
	}
	
	public List<Drink> getMenuDrink() {
		return menuDrink;
	}

}
