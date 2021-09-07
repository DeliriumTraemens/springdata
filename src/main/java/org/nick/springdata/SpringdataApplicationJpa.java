package org.nick.springdata;

import org.nick.springdata.entity.Passport;
import org.nick.springdata.entity.Person;
import org.nick.springdata.entity.Phone;
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
	
	@Autowired
	PersonJdbcDao personJdbcDao;

	

	@Override
	public void run(String... args) throws Exception {
//		Person anna = new Person("Anna", "Andreeva","Samara");
//		Person olesya = new Person("Olesya", "Andreeva","Boston");
////
//		Passport passportAnna= new Passport("A11234");
//		Passport passportOlesya= new Passport("B23234");
//
//		Phone phone1 = new Phone("123-456-789");
//		Phone phone2 = new Phone("231-546-879");
//		Phone phone3 = new Phone("312-645-978");
//		Phone phone4 = new Phone("789-123-456");
////
//		anna.setPassport(passportAnna);
//		anna.setPhones(Arrays.asList(phone1,phone2));
//
//		olesya.setPassport(passportOlesya);
//		olesya.setPhones(Arrays.asList(phone3, phone4));
////
//		List<Person> people = Arrays.asList(anna,olesya); // Создание и инициализация Списка в одну строку
////
//		personRepository.saveAll(people);

//		List<Person>peeples=personRepository.findByFirstName("Anna");
//
//		System.out.println(peeples.get(0).getPhones());
		
		
List<Person>people = personRepository.findAll();
		System.out.println(people);
		
//
//		personRepository.deleteAll();

		
		
//		System.out.println("\n\nJDBC>>>>>>>"+personRepository.findAllOrderedByFirstName()+"\n");
//		System.out.println("\n\nJDBC>>>>>>>"+personJdbcDao.peoplePass()+"\n");
		


	}
}
