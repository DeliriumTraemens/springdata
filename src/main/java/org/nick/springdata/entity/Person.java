package org.nick.springdata.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private int id;
	
	private String firstName;
	private String lastName;
	private String address;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passport_id") /*Колонка из таблицы Person (person.passport_id)  */
	private Passport passport;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "person_id")
//	private List<Phone> phones/* = new ArrayList()*/;
	
//	Uni-directional
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id")
	private List<Phone> phones;

	//	Bi-directional
	@OneToMany(mappedBy = "person",cascade=CascadeType.ALL)// mappedBy = "person" из Address private Person person;
	private List<Address> addresses;
	
	
	/*---------------------*/
	
	public Person() {
	}
	
	public Person(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public Person(String firstName, String lastName, String address, Passport passport) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.passport = passport;
	}
	/*---------------------*/
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Passport getPassport() {
		return passport;
	}
	
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	public List<Phone> getPhones() {
		return phones;
	}
	
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	
	
	@Override
	public String toString() {
		return "\nPerson{" +
				       "id=" + id +
				       ", firstName='" + firstName + '\'' +
				       ", lastName='" + lastName + '\'' +
				       ", address='" + address + '\'' +
				       ",\n passport=" + passport +
				       ", \nphones=" + phones +
				       "\n" + '}';
	}
}
