package com.tnsif.inheritance;

public class Customer {
	private String name;
	private int id;
	private long adharNo;
	private long phoneNo;
	
	//default constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", adharNo=" + adharNo + ", phoneNo=" + phoneNo + "]";
	}
	
}
