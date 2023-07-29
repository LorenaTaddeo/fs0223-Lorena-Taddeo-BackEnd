package classes;

public class PizzaSalami extends Pizza{
	
	private String salami;
	
	public PizzaSalami(Double prezzo, Double calories, String cheese, String tomate, String salami) {
		super(prezzo, calories, cheese, tomate);
		this.salami = salami;
	}
}
