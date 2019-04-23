package lt.bta.java2.sprngsimple;

import lt.bta.java2.sprngsimple.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class SprngSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprngSimpleApplication.class, args);
	}

}

interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

}

@Component
class MyAppRunner implements CommandLineRunner {

	@Autowired
	ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		productRepository.findAll().forEach(System.out::println);
	}
}


