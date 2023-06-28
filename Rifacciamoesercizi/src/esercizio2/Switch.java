package esercizio2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programma();

	}

	public static void programma () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi un numero:");
		int x = scanner.nextInt();
		
		switch (x) {
		case 0:
			System.out.println("zero");	
			break;
		case 1:
			System.out.println("uno");	
			break;
		case 2:
			System.out.println("due");	
			break;
		case 3:
			System.out.println("tre");	
			break;
		default:
			System.out.println("Errore");
			break;
		}
		
	}
}
