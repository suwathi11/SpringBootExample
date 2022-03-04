package com.example.SpringBoot.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {
	
	@Id
	@GeneratedValue
	private int id;

	private String name;
	private String location;
	private Date birthdate;
	
	public Person() {
		
	}
	
	public Person( String name, String location, Date birthdate) {
		super();
		this.name = name;
		this.location = location;
		this.birthdate = birthdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	@Override
	public String toString() {
		return String.format("\nPerson [id=%s, name=%s, location=%s, birthDate=%s]", id, name, location, birthdate);
	}

	
	

}