package classes;

public class PizzaHawaiana extends Pizza{
	
	private String ham;
	private String pineapple;
	
	public PizzaHawaiana(Double prezzo, Double calories, String cheese, String tomate, String ham, String pineapple) {
		super(prezzo, calories, cheese, tomate);
		this.ham = ham;
		this.pineapple = pineapple;
	}
}
