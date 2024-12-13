package com.gn.practice10.model.vo;

public class Planet {
	private String name;
	private int diameter;
	private double period;
	
	public Planet() {}
	public Planet(String name,int diameter,double period) {
		this.name = name;
		this.diameter = diameter;
		this.period = period;
	}
	public String getName() {
		return name;
	}
	public int getDiameter() {
		return diameter;
	}
	public double getPeriod() {
		return period;
	}
	@Override
	public String toString() {
		return ", 값:"+name+" (지름: "+diameter+" km, 공전주기:"+period+"년)";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
