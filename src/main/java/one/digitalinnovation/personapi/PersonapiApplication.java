package one.digitalinnovation.personapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonapiApplication {

	public static void main(String[] args) {
		System.out.println( "API ON!");
		SpringApplication.run(PersonapiApplication.class, args);
	}
		//SpringApplication.run(PersonapiApplication.class, args);
		//PersonapiController.getPeople();

}
