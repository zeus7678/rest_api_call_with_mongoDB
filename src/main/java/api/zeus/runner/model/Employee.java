package api.zeus.runner.model;

import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="employee_list")
public class Employee {
	
	
	
	@Field(value="firstname")
	private String firstname;
	
	@Field(value="lastname")
	private String lastname;

	@Id
	@Field(value="email")
	private String email;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	

}
