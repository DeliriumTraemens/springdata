package org.nick.springdata.entity;

import javax.persistence.*;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String city;
	private String street;
	private String houseNumber;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "person_id")
	//
	private Person person;
	
	/*---------------------*/
	
	public Address() {
	}
	
	public Address(int id, String city, String street, String houseNumber, Person person) {
		this.id = id;
		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
		this.person = person;
	}
	
	/*---------------------*/
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}
	
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	/*---------------------*/
	
	@Override
	public String toString() {
		return "\nAddress{" +
				       "id=" + id +
				       ", city='" + city + '\'' +
				       ", street='" + street + '\'' +
				       ", houseNumber='" + houseNumber + '\'' +
				       ", person=" + person +
				       '}';
	}
}
