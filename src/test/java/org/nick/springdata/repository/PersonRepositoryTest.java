package org.nick.springdata.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nick.springdata.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTest {
	
	@Autowired
	PersonRepository personRepository;
	
	@org.junit.Test
	public void findByFirstName() {
		List<Person> people = personRepository.findByFirstName("Anna");
		
		assertThat(people).hasSize(1);
		assertThat(people.get(0).getLastName()).isEqualTo("Andreeva");
	}
	
	@Test
	public void findAllOrderedByFirstName() {
		List<Person> people = personRepository.findAllOrderedByFirstName();
		assertThat(people).hasSize(3);
		assertThat(people.get(2).getFirstName()).isEqualTo("Olesya");
		assertThat(people.get(1).getFirstName()).isEqualTo("Anna");
		assertThat(people.get(0).getFirstName()).isEqualTo("Alex");
	}
}