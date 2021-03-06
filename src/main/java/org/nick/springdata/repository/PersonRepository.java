package org.nick.springdata.repository;

import org.nick.springdata.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	
	List<Person> findByFirstName(String firstName);
	
//	@Transactional
//	List<Person> findAll();
	
	@Query("select p from Person p order by p.passport.number")
	List<Person> findAllOrderedByFirstName();

}
