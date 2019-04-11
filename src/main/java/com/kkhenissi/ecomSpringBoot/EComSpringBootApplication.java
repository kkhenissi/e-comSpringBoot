package com.kkhenissi.ecomSpringBoot;

import com.kkhenissi.ecomSpringBoot.dao.CategoryRepository;
import com.kkhenissi.ecomSpringBoot.dao.ProductRepository;
import com.kkhenissi.ecomSpringBoot.entities.Category;
import com.kkhenissi.ecomSpringBoot.entities.Product;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class EComSpringBootApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(EComSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		categoryRepository.save(new Category(null, "Computer", null, null));
		categoryRepository.save(new Category(null, "Printer", null, null));
		categoryRepository.save(new Category(null, "swatch", null, null));

		Random rnd = new Random();
		categoryRepository.findAll().forEach(c -> {
			for (int i = 0; i <10 ; i++) {
				Product p = new Product();
				p.setName(RandomString.make(18));
				p.setCurrentPrice(100+rnd.nextInt(10000));
				p.setAvailable(rnd.nextBoolean());
				p.setSelected(rnd.nextBoolean());
				p.setPromotion(rnd.nextBoolean());
				p.setCategory(c);
				productRepository.save(p);
			}



		});

	}
}
