package com.gn.practice04.controller;

import com.gn.practice04.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		//객체화
		Car myCar = new Car();
		
		//1
		myCar.startEngine();
		
		//2
		int defaultSpeed = myCar.checkSpeed();
		System.out.println("기본 속도는 "+defaultSpeed+"입니다.");
		
		//3
		myCar.setSpeed(150);
		
		//4.
		String result = myCar.setDestination("부산");
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
