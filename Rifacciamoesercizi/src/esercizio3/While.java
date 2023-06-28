package esercizio3;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		While();

	}
	
	public static void While() { 
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Inserisci una stringa:");
			String stringa = scanner.nextLine();
			
			if(stringa.equals(":q")) {
				break;
			}
			
			String[] array = stringa.split("");
			
			for(int i = 0; i < array.length; i++) {
				System.out.println(array[i] + ",");
			}
			
		}
		System.out.println("FINE");
	}

}
