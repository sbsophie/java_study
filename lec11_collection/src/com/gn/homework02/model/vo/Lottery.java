package com.gn.homework02.model.vo;

public class Lottery implements Comparable<Lottery>{
	private String name;
	private String phone;
	
	public Lottery() {}
	
	public Lottery(String name, String phone) {}
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return name+phone;
	}
	
	public int hashCode() {
		return 
	}
	
	public boolean equals(Object obj) {
		
	}
	
	public int compareTo(Lottery l) {
		
	}
	
	
	
	
	
	
	
}
