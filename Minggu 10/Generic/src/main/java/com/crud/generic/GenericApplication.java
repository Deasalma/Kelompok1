package com.crud.generic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class GenericApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenericApplication.class, args);
	}
	
	/*@Bean 
	CommandLineRunner runner(ProductService productService) {
		return args ->{
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Product>> typeReference = new TypeReference<List<Product>>() {};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/product.json");
			try {
				List<Product> product = mapper.readValue(inputStream, typeReference);
				productService.save((Product) product);
				System.out.println("Users Saved!");
			} catch (IOException e) {
				System.out.println("Unable to save users: " + e.getMessage());
			}
			
		};
	}*/
}
