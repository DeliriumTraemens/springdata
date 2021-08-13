package org.nick.springdata.jdbc;

import org.nick.springdata.entity.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper <Person>{
	@Override
	public Person mapRow(ResultSet resultSet, int i) throws SQLException {
		Person person = new Person();
		
		System.out.println("\n RS\n"+resultSet.getMetaData());
		
		
//		person.setId(resultSet.getInt("id"));
		person.setFirstName(resultSet.getString("first_name"));
		person.setLastName(resultSet.getString("last_name"));
		person.setAddress(resultSet.getString("address"));
		
		return person;
	}
}
