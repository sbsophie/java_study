package com.gn.practice03.model.vo;

public class Vehicle {
	private int wheel;
	
	public Vehicle() {}
	
	public Vehicle(int wheel) {
		this.wheel = wheel;
	}
	//getter
	public int getWheel() {
		return wheel;
	}
	//setter
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	public void go() {
		System.out.println(" 지나가요~");
	}
	
}
