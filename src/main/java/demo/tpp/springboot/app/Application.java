package demo.tpp.springboot.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
    public void run(String... arg0) throws Exception {
		System.out.println("----------- TropiPay Demo TEST--------------");
		RestTemplate plantilla = new RestTemplate();
        String resultado = plantilla.getForObject("http://localhost:8080/api/profile", String.class);
		System.out.println(resultado);
    }
}
