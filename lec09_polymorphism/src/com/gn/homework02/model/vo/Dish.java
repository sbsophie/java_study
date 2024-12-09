package com.gn.homework02.model.vo;

public class Dish implements Menu{
	private String ingredients;
	
	public Dish() {}
	
	public Dish(String name,int price,String ingredients) {
		this(name,price);
		this.ingredients = ingredients;
	}
	
	public String getName() {
		return NAME;
	}
	public int getPrice() {
		this.price = price;
	}
	
	
}
