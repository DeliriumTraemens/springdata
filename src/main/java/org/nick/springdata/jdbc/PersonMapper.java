package org.nick.springdata.jdbc;

import org.nick.springdata.entity.Passport;
import org.nick.springdata.entity.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper <Person>{
	@Override
	public Person mapRow(ResultSet resultSet, int i) throws SQLException {
		Person person = new Person();
		Passport passport = new Passport();
//		System.out.println("\n RS\n"+resultSet.getMetaData());
		
		passport.setId(resultSet.getInt("passport.id"));
		passport.setNumber(resultSet.getString("passport.number"));
		person.setId(resultSet.getInt("person.id"));
		person.setFirstName(resultSet.getString("person.first_name"));
		person.setLastName(resultSet.getString("person.last_name"));
		person.setAddress(resultSet.getString("person.address"));
		person.setPassport(passport);
		
		
		return person;
	}
}
