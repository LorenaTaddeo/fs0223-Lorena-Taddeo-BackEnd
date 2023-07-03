package com.epicode.kmLitro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Auto {

	public static void main(String[] args) {
		Programma();

	}
	
	public static void Programma() {
		int km;
		int litri;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		try {
		System.out.println("Numero di km percorsi?");
		km = sc.nextInt();
		System.out.println("Numero di litri consumati?");
		litri = sc.nextInt();
		
		int divisione = km / litri; 
		System.out.println(divisione);
		
		
		}catch(InputMismatchException e){
			System.out.println("Errore, devi inserire un numero!");
		}catch(ArithmeticException e) {
			System.out.println("Errore " + e.getMessage() + " Fine");
			break;
		}
		}
	
		
	}

}
