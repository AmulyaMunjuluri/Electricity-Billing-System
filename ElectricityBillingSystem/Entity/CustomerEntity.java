package com.project.ElectricityBillingSystem.Entity;

import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Table(name="customer")
public class CustomerEntity {
	
	@Id
	//@SequenceGenerator(name="CUSTOMER_SEQ_GEN", sequenceName="CUSTOMER_SEQ_GEN", allocationSize=1)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_SEQ_GEN")
	private int cust_id;
	
	@NotNull(message = "full_name is mandatory")
	private String full_name;
	
	@NotNull(message = "mobile is mandatory")
	private String mobile;
	
	@Email(message = "Email should be valid")
	@NotNull(message = "email is mandatory")
	private String email;
	
	@Positive (message = "bill_id should be greater than 0")
	private int bill_id;
	
	@Positive (message = "service_id should be greater than 0")
	private int service_id;
	
	@Positive (message = "payment_id should be greater than 0")
	private int payment_id;
	
	@Positive (message = "address_id should be greater than 0")
	private int address_id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billingEntity_id")
	private BillingEntity billingEntity;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="LoginEntity_email")
	private LoginEntity loginEntity;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="AddressEntity_id")
	private AddressEntity addressEntity;
	
	//@OneToMany(cascade=CascadeType.ALL)
	//@JoinColumn(name="customer_id")
    //private Set<AddressEntity> addressEntity;
	
	public CustomerEntity() {
		super();
	}

	public CustomerEntity(int cust_id, String full_name, String mobile, String email, int bill_id, int service_id,
			int payment_id, int address_id) {
		super();
		this.cust_id = cust_id;
		this.full_name = full_name;
		this.mobile = mobile;
		this.email = email;
		this.bill_id = bill_id;
		this.service_id = service_id;
		this.payment_id = payment_id;
		this.address_id = address_id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	@Override
	public String toString() {
		return "CustomerEntity [cust_id=" + cust_id + ", full_name=" + full_name + ", mobile=" + mobile + ", email="
				+ email + ", bill_id=" + bill_id + ", service_id=" + service_id + ", payment_id=" + payment_id
				+ ", address_id=" + address_id + "]";
	}

	public BillingEntity getBilling_entity_id() {
		return billingEntity;
	}

	public void setBillingEntity(BillingEntity billing_entity_id) {
		this.billingEntity = billing_entity_id;
	}

//	public Set<AddressEntity> getAddressEntity() {
//		return addressEntity;
//	}
//
//	public void setAddressEntity(Set<AddressEntity> addressEntity) {
//		this.addressEntity = addressEntity;
//	}
	
	
}
