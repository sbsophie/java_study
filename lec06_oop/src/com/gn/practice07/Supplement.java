package com.gn.practice07;

public class Supplement {
	public String name;
	public String day;
	public int price;
	
	public Supplement() {}
	
	public Supplement(String name,String day,int price) {
		this.name = name;
		this.day = day;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public String getDay() {
		return day;
	}
	public int getPrice() {
		return price;
	}
	
	
	public String information() {
		return "이름: "+name+","+"복용량: "+day+","+"가격: "+price+"원";
		
		
	}
	
	
	
}
