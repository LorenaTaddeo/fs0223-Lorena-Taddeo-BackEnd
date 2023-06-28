package esercizio1;

public class Ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringaPariDispari("cia"));
		System.out.println(annoBisestile(2024));
	}

	public static boolean stringaPariDispari(String x) {
		if(x.length() % 2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static boolean annoBisestile(int anno) {
		if(anno % 4 == 0 || anno % 100 == 0 && anno % 400 == 0) {
			return true;
		}else {
			return false;
		}
	}
}
