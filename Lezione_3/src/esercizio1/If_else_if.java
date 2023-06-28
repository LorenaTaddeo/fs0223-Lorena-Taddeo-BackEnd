package esercizio1;

public class If_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringaPariDispari("parla"));
		System.out.println(annoBisestile(2000));
		

	}
	
	public static boolean stringaPariDispari (String x) {
		if(x.length() % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean annoBisestile(int x) {
		if(x % 4 == 0 || x % 100 == 0 & x % 400 == 0 ){
			return true;
		}else {
			return false;
		}
	}

}
