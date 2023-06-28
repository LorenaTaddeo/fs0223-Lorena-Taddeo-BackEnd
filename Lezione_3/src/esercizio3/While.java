package esercizio3;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		While();

	}

	public static void While() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci una stringa:");
		String x = sc.nextLine();
		String[] CharArray = x.split("");
		String CharArray1 = String.join(",", CharArray);
		System.out.println("Stringa divisa: " + CharArray1);
		while(true) {
			if(x.equals(":q")) {
				System.out.println("Fine");
				break;
			}
		}
		
	}
}
