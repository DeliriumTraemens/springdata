package org.nick.springdata;

import org.hibernate.LazyInitializationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nick.springdata.entity.Person;
import org.nick.springdata.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationsTest {
	
	@Autowired
	PersonRepository personRepository;
	
	@Test(expected= LazyInitializationException.class)
	public void lazyLoadingException () throws Exception {
		List<Person> anna = personRepository.findByFirstName("Anna");
		//session closed
		System.out.println(anna.get(0).getPhones());
	}
	
	@Test
	@Transactional
	public void lazyLoadingTransactional () throws Exception {
		List<Person> anna = personRepository.findByFirstName("Anna");
		List<Person> peoples = personRepository.findAll();
		System.out.println("\n\n>>>>"+anna.get(0)/*.getPhones()*/);
		System.out.println("\n\n>>>>"+peoples);
	}
	
}
