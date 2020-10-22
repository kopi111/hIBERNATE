package AOOP_COM.Hobbs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "hobbs", name="hob")



public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="fistName")
	private String fistName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;

	
	public Student(int id, String fistName, String lastName, String email) {
		
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		this.email = email;
	}

	public Student() {
	
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public long getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFistName() {
		return fistName;
	}


	public void setFistName(String fistName) {
		this.fistName = fistName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
