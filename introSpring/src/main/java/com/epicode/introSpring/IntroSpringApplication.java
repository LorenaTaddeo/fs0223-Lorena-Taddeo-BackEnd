package com.epicode.introSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.epicode.introSpring.Configuration.config_bean.ConfigurationTest;


@SpringBootApplication
public class IntroSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroSpringApplication.class, args);
	}
	
	public static void configWith_Beans1() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationTest.class);
	 
		//Recupero un bean Singleton
		Test t1 = (Test) appContext.getBean("test");//invoco un bean di nome test e mi faccio 
		System.out.println(t1);
		System.out.println(t1.info());
	
	}

}
