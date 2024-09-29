package pe.edu.cibertec.sw_.asyng_hilo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SwAsyngHiloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwAsyngHiloApplication.class, args);
	}

}
