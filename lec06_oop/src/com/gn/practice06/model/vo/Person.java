package com.gn.practice06.model.vo;

public class Person {
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//setter 데이터
	public void setId(String id) {
		this.id = id;
	}	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phoen) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
	// getter 데이터
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
	
	public String information() {
		return "id : "+id+"\npwd : "+pwd+"\nname : "+name
				+"\nage : "+age+"\ngender : "+gender
				+"\nphone : "+phone+"\nemail : "+email;	
	}
	
	
}

