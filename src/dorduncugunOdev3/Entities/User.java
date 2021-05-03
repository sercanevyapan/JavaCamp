package dorduncugunOdev3.Entities;

import java.util.Date;

import dorduncugunOdev3.Abstract.Entity;

public class User implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private Date yearOfBirth;

	public User(int id, String firstName, String lastName, String nationalityId, Date yearOfBirth) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.yearOfBirth = yearOfBirth;
	}

	public User() {

	}

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

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public Date getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(Date yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}
