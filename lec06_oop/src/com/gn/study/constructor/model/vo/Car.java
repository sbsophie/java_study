package com.gn.study.constructor.model.vo;

public class Car {
	
	private String brand;
	private String color;
	private int year;
	
//	public Car(String b, String c, int y) {
//		brand = b;
//		color = c;
//		year = y;
//	}   -> 이건 잘못됨
	
	public Car() { // 매개변수 생성자를 run에 만들게되면 자동으로 만들어진 기본생성자에 있는 JVD가 사라져서 
					// 둘다 사용하고 싶으면 Car클래스에 이렇게 넣어줘야함
		this("미정","미정",2024);  // this() 사용예시
	}
	
	public Car(String brand, String color, int year) {
		this.brand = brand;
		this.color = color;
		this.year = year;
	}
		
	
}
