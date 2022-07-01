package com.project.ElectricityBillingSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

//specifies that the class is an entity and is mapped to a database table
@Entity

//allows to specify the details of a table
@Table(name="address")
public class AddressEntity {

	@Id   // primary key of an entity
//	@SequenceGenerator(name="ADD_SEQ_GEN", sequenceName="ADD_SEQ_GEN", allocationSize=1)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ADD_SEQ_GEN")
	private int id;
	
	//a method should not return null 
	@NotNull(message = "d_no is mandatory")
	private String d_no;

	@NotNull(message = "street is mandatory")
	private String street;

	@NotNull(message = "city is mandatory")
	private String city;
	
	@NotNull(message = "state is mandatory")
	private String state;
	
	@OneToOne(mappedBy = "addressEntity")
	private CustomerEntity customerEntity;
	
	//noargsConstructor
	public AddressEntity() {
		//to call the parent class constructor
		super();
	}
	//All args constructor
	public AddressEntity(int id, String d_no, String street, String city, String state) {
		super();
		this.id = id;
		this.d_no = d_no;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	//to return a values
	public int getId() {
		return id;
	}
	
	//to update a data
	public void setId(int id) {
		this.id = id;
	}
	public String getD_no() {
		return d_no;
	}
	public void setD_no(String d_no) {
		this.d_no = d_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	//to represent string values
	@Override
	public String toString() {
		return "AddressEntity [id=" + id + ", d_no=" + d_no + ", street=" + street + ", city=" + city + ", state="
				+ state + "]";
	}
	
	
}
