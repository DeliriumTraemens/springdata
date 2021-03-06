package org.nick.springdata.entity;

import javax.persistence.*;

@Entity
public class Passport {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(unique = true, nullable = false)
	private String number;
	
	@OneToOne(mappedBy = "passport", cascade = CascadeType.ALL)
	private Person person;
	
	
	public Passport() {
	}
	
	public Passport(String number) {
		this.number = number;
	}
	
	public Passport(String number, Person person) {
		this.number = number;
		this.person = person;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Passport{" +
				       "id=" + id +
				       ", number='" + number + '\'' +
				       '}';
	}
}
