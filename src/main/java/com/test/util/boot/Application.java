package com.test.util.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.test.product.domain.Product;
import com.test.product.repository.ProductRepository;
import com.test.user.domain.Address;
import com.test.user.domain.User;
import com.test.user.repository.UserRepository;

@SpringBootApplication
@EnableMongoRepositories("com.test")
public class Application implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public void run(String... args) throws Exception {

		saveUsers();
		saveProducts();

	}

	public void saveUsers() {
		userRepository.deleteAll();
		Address address = new Address();
		address.setCity("secunderabad");
		address.setCountry("India");
		address.setFlatNo("hno:511");
		address.setLane("Lane 2");
		address.setState("Telangana");
		address.setPinCode("500010");

		User user1 = new User("kiran", "kiran", address, "kiran", "kumar");

		Address address2 = new Address();
		address2.setCity("hyderabad");
		address2.setCountry("India");
		address2.setFlatNo("hno:211");
		address2.setLane("Lane 4");
		address2.setState("Telangana");
		address2.setPinCode("500081");

		User user2 = new User("test", "test", address2, "test", "test");

		userRepository.save(user1);
		userRepository.save(user2);

		// fetch all customers
		System.out.println("User found with findAll():");
		System.out.println("-------------------------------");
		for (User user : userRepository.findAll()) {
			System.out.println(user);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Product found with findByUserName('kiran'):");
		System.out.println("--------------------------------");
		System.out.println(userRepository.findByUserName("kiran"));
	}

	public void saveProducts() {
		productRepository.deleteAll();

		Product product = new Product();

		product.setDescription("Bag1 Description");
		product.setCategory("Bags");
		product.setId("bag1");
		product.setImage("img1.jpg");
		product.setName("Bag1");
		product.setQuantity(10);
		product.setUnitPrice(1000);
		product.setTotal(1000);

		Product product2 = new Product();

		product2.setDescription("Bag2 Description");
		product2.setCategory("Bags");
		product2.setId("bag2");
		product2.setImage("img2.jpg");
		product2.setName("Bag2");
		product2.setQuantity(10);
		product2.setUnitPrice(1200);
		product2.setTotal(1200);

		Product product3 = new Product();

		product3.setDescription("Bag3 Description");
		product3.setCategory("Bags");
		product3.setId("bag3");
		product3.setImage("img3.jpg");
		product3.setName("Bag3");
		product3.setQuantity(10);
		product3.setUnitPrice(800);
		product3.setTotal(800);

		Product product4 = new Product();

		product4.setDescription("Bag4 Description");
		product4.setCategory("Bags");
		product4.setId("bag4");
		product4.setImage("img4.jpg");
		product4.setName("Bag4");
		product4.setQuantity(10);
		product4.setUnitPrice(800);
		product4.setTotal(800);

		Product product5 = new Product();

		product5.setDescription("Bag5 Description");
		product5.setCategory("Bags");
		product5.setId("bag5");
		product5.setImage("img5.jpg");
		product5.setName("Bag5");
		product5.setQuantity(10);
		product5.setUnitPrice(1800);
		product5.setTotal(1800);

		productRepository.save(product);
		productRepository.save(product2);
		productRepository.save(product3);
		productRepository.save(product4);
		productRepository.save(product5);

		// fetch all customers
		System.out.println("User found with findAll():");
		System.out.println("-------------------------------");
		for (Product product6 : productRepository.findAll()) {
			System.out.println(product6);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Product found with findByCategory('Bags'):");
		System.out.println("--------------------------------");
		System.out.println(productRepository.findBycategory("Bags"));

		for (Product product6 : productRepository.findBycategory("Bags")) {
			System.out.println(product6);
		}
	}

}