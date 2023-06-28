package esercizio4;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		For();

	}
	
	public static void For() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un numero intero:");
		int x = scanner.nextInt();
		
		for(int i = x; i >= 0; i--) {
			System.out.println(i);
		}
	}

}
