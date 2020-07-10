package com.example.demo.domain;

public class User {

	private String fullname;
	private int age;
	private String Gender;
	private boolean Employed;
	
	public User()
	{
		
	}
	
	public User(String fullname, int age, String gender, boolean employed) {
		super();
		this.fullname = fullname;
		this.age = age;
		Gender = gender;
		Employed = employed;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public boolean isEmployed() {
		return Employed;
	}
	public void setEmployed(boolean employed) {
		Employed = employed;
	}
	
}
