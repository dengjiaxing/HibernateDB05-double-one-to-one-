package org.hibernate.User;

public class User {
	private int userid;
	private String name;
	private String password;
	private Address address;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int userid, String name, String password, Address address) {
		this.userid = userid;
		this.name = name;
		this.password = password;
		this.address = address;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
