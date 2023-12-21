package com.deloitte.java.model;

public class Customer {
	private String name , email , password, phoneNo , gender , address ;
	
	private int customer_id, pincode;
	
	
	public Customer(String name, String email, String password, String phoneNo, String gender, String address,
			int pincode) {
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.address = address;
		this.pincode = pincode;
	}
	
	

	public Customer(String name, String email, String password, String phoneNo, String gender, String address,
			int pincode, int customer_id) {
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.address = address;
		this.pincode = pincode;
		this.customer_id = customer_id;
	}



	public int getCustomer_id() {
		return customer_id;
	}



	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", phoneNo=" + phoneNo
				+ ", gender=" + gender + ", address=" + address + ", pincode=" + pincode + "]";
	}
	
	
}
