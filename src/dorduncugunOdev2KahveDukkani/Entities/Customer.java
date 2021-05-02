package dorduncugunOdev2KahveDukkani.Entities;

import java.util.Date;

import dorduncugunOdev2KahveDukkani.Abstract.IEntity;

public class Customer implements IEntity{
	

	private int Id;
	private String FirstName;
	private String LastName;
	private Date DateOfBirth;
	private String NationalityId;
	
	
	public Customer() {
	
	}


	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public Date getDateOfBirth() {
		return DateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}


	public String getNationalityId() {
		return NationalityId;
	}


	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

	
}


