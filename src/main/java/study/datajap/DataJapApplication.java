package study.datajap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DataJapApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataJapApplication.class, args);
	}

}
