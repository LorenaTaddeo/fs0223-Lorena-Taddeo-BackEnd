package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		System.out.println(moltiplica(3, 7));
		System.out.println(conc("Siamo", 5));
		System.out.println(tastiera());
		System.out.println(perimetroRettangolo(5, 7));
		System.out.println(pariDispari(10));
		System.out.println(perimetroTriangolo(2, 4, 6));
		System.out.println(areaTriangolo(2, 4, 6));
		}
		
	public static int moltiplica(int x, int y) {
		int result = x * y;
		return result;
	}
	
	public static String conc(String x, int y) {
		 String result = x + " " + y;
		return result;
	}
	
	
		public static String tastiera(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il tuo nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Inserisci il tuo cognome:");
		String cognome = sc.nextLine();
		
		System.out.print("Inserisci la tua età:");
		String età = sc.nextLine();
		
		System.out.print("Inserisci la tua città:");
		String città = sc.nextLine();
		
		return ("Ciao" + nome + " " + cognome + "da" + città);	
	}
		
	public static float perimetroRettangolo (float x, float y) {
		float result = x + y * 2;
		return result;
		}
	
	public static int pariDispari(int x) {
		if(x % 2 == 0) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public static double perimetroTriangolo(double x, double y, double z) {
		double perimetro = x + y + z;
		return perimetro;
	}
	
	public static double areaTriangolo (double x, double y, double z) {
		double p = (x + y + z)/2;
		double area = Math.sqrt(p * (p - x) * (p - y) * (p-z));
		return area;
	}
	
}




