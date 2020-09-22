package cm.belrose.gestionstockmvc;

import cm.belrose.gestionstockmvc.initialisationDb.StockInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionstockmvcApplication  implements CommandLineRunner {
	@Autowired
	StockInitService stockInitService;

	public static void main(String[] args) {
		SpringApplication.run(GestionstockmvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		stockInitService.initCategorie();
	}
}
