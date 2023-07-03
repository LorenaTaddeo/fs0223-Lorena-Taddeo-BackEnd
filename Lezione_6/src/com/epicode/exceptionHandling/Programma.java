package com.epicode.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programma {
	
	public static void main(String[] args) {
		mettiNumero();
	}
	
	public static void mettiNumero() {
		int[] arr = new int[5];
		int numero;
		int numeroArray;
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = (int) Math.ceil(Math.random() * 9);
				System.out.println(arr[i]);
			}
			
			while(true) {
				try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Inserisci un numero intero tra 1 e 10:");
				numero = scanner.nextInt();
				
				if(numero == 0) {
					System.out.println("Finito il programma");
					break;
				}
				
				System.out.println("In quale posizione vuoi metterlo da 1 a 5?");
				numeroArray = scanner.nextInt();
				
				arr[numeroArray - 1] = numero;
				
				for(int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				
			}catch(InputMismatchException e) {
				System.out.println("ERRORE, metti un numero da 1 a 10!");
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ERRORE, metti una posizione da 1 a 5!");
				
			}
		}
	}
}
