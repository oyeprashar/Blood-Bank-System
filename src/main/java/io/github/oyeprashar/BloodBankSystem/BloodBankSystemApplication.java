package io.github.oyeprashar.BloodBankSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class BloodBankSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodBankSystemApplication.class, args);
	}

}
