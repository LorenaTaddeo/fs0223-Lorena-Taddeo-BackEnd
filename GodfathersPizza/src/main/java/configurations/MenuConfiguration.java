package configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import classes.Menu;

@Configuration
public class MenuConfiguration {

	@Bean
	@Scope("singleton")
	public Menu Menu() {
		Menu m = new Menu();
		
		m.getMenuPizza();
	}
}
