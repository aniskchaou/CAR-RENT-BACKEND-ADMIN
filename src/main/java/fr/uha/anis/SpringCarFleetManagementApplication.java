package fr.uha.anis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringCarFleetManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCarFleetManagementApplication.class, args);
	}

}
