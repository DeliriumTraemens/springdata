package org.nick.springdata;

import org.nick.springdata.entity.Person;
import org.nick.springdata.jdbc.PersonJdbcDao;
import org.nick.springdata.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringdataApplicationJpa implements CommandLineRunner {
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplicationJpa.class, args);
	
	
	}
	@Autowired
	PersonRepository personRepository;

	

	@Override
	public void run(String... args) throws Exception {
//		Person anna = new Person("Anna", "Andreeva","Samara");
//		Person olesya = new Person("Olesya", "Andreeva","Moscow");
//		Person alex = new Person("Alex", "Andreeva","Omsk");
//
//		List<Person> people = Arrays.asList(anna,olesya,alex);
//		personRepository.saveAll(people);

		List<Person> plp = personRepository.findAll();
		System.out.println("\n\n>>>>>>>"+plp.toString()+"\n");
		
//		List<Person>peoples = personRepository.findByFirstName("Anna");
		
		System.out.println("\n\n>>>>>>>"+personRepository.findByFirstName("Anna")+"\n");
		
//		System.out.println(personRepository.findAllOrderByFirstName());


	}
}
