
public class Rettangolo {
	 	public int altezza;
	    public int larghezza;
		    
		    public Rettangolo(int altezza, int larghezza) {
		        this.altezza = altezza;
		        this.larghezza = larghezza;
		    }
		    
		    public int calcolaArea() {
		    	int a = (altezza * larghezza) * 2;
		        return a;
		    }
		    
		    public int calcolaPerimetro() {
		        int p = altezza + larghezza;
		        return p;
		    }
		    
		    public void stampaRettangolo() {
		    	System.out.println(calcolaArea());
		    	System.out.println(calcolaPerimetro());
		    }
		    
		    public static void dueRettangoli (r x, r y) {
		    	int area = x.area() + y.area();
		    	int perimetro = x.perimetro() + y.perimetro();
		    	
		    	   System.out.println(x.calcolaArea());
		           System.out.println(x.calcolaPerimetro());
		           System.out.println(y.calcolaArea());
		           System.out.println(y.calcolaPerimetro());
		           System.out.println(area);
		           System.out.println(perimetro);
		    }
		}
