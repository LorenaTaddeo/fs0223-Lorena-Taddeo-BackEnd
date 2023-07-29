package classes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pizza extends Consumabile{
	
	private String cheese;
	private String tomate;
	
	public Pizza(Double prezzo, Double calories, String cheese, String tomate) {
		super(prezzo, calories);
		this.cheese = cheese;
		this.tomate = tomate;
	}

	
}
