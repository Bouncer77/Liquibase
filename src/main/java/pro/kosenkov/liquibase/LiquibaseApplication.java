package pro.kosenkov.liquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiquibaseApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(LiquibaseApplication.class, args);
		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		}
	}

}
