package dorduncugunOdev3.Entities;

import java.util.Date;

public class Admin extends User {
	
	private String department;
	private String position;
	
	public Admin(int id, String firstName, String lastName, String nationalityId, Date yearOfBirth, String department,
			String position) {
		super(id, firstName, lastName, nationalityId, yearOfBirth);
		this.department = department;
		this.position = position;
	}

	public Admin() {}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	
	
	

}
