package com.nagarro.model;

public class UserDto {

	private String email;
	private String name;
	private String age;

	public UserDto(String email, String name, String age) {
		super();
		this.email = email;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
