package org.nick.springdata.jdbc;

import org.nick.springdata.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;
import java.util.Objects;

@Repository
public class PersonJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Person> findAll(){
//		 List<Person> people = jdbcTemplate.query("select * from jpa.person", new BeanPropertyRowMapper<>(Person.class));
		 List<Person> people = jdbcTemplate.query("select * from jpa.person", new PersonMapper());
		 
		 
		return people;
	}
	
	public int insert(Person person){
		return jdbcTemplate.update("insert into jpa.person (first_name, last_name, address) values(?,?,?,?)",
		                    new Object[]{
		                                 person.getFirstName(),
		                                 person.getLastName(),
		                                 person.getAddress()}
		                                 );
	}

}
