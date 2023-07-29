package classes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Consumabile extends Prodotti{
	
	private Double calories;

	public Consumabile(Double prezzo, Double calories) {
		super(prezzo);
		this.calories = calories;
	}

	
	
}
