package com.gn.practice03.model.vo;

public class Circle extends Point{
	private int radius;
	private final static double PI = 3.14;
	
	// 기본생성자
	public Circle() {}
	
	//매개변수 생성자(x.y는 부모 생성자를 통해 초기화)
	public Circle(int x,int y,int radius) {
		super(x,y);
		this.radius = radius;
	}
	// 1. 부모 클래스의 draw() 메소드 호출을 통해 x,y좌표 값 출력
	// 2. 원의 면적, 둘레 값을 출력
	// 면적 : PI * 반지름 * 반지름
	// 둘레 : PI * 반지름 * 2 
	@Override
	public void draw() {
		super.draw();
		System.out.printf("면적 : %.1f ",PI*radius*radius);
		System.out.println();
		System.out.printf("둘레 : %.1f",PI*radius*2);
		System.out.println();
	}
	

	
	
}
