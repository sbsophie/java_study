package com.gn.study.field.controller;

import com.gn.study.field.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		// 실행은 메인메소드가 있는 곳에서 해야함
		
		
		// 1. 객체 생성
		Car c1 = new Car();
		// 2. 값 대입
//		c1.name = "소방차";
		// 3. 값 호출
		System.out.println(c1.name);
		
// [예약어] 종류 3가지 : static, final, static final	
		Car c2 = new Car();
		Car c3 = new Car();
		c2.brand = "현대";
		System.out.println(c2.name);
		System.out.println(c2.brand);
		c3.brand = "BMW";
		System.out.println(c2.brand);
		System.out.println(c3.brand);
		//static은 값을 바꿀수 있지만 동일한 저장공간을 사용해서 사용시 주의해야함		
		
		//명시적 초기화 한 name 필드 출력
		System.out.println(c3.name);
		
		
		
	}
}
