package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.controller.BeanConfiguration;
import dmacc.repository.HouseRepository;
import dmacc.beans.House;

@SpringBootApplication
public class SpringHousesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHousesApplication.class, args);
	}//end main

	@Autowired
	HouseRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		//create application context
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//get object from bean
		House h = appContext.getBean("house", House.class);
		repo.save(h);
		
		List<House> housesInDatabase = repo.findAll();
		
		for (House house: housesInDatabase) {
			System.out.println(house.toString());
		}//end for
	}//end run

}//end SpringHousesApplication
