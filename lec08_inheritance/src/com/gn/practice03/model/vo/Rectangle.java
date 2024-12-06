package com.gn.practice03.model.vo;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	// 기본생성자
	public Rectangle() {}
	
	// 매개변수 생성자(x,y는 부모 생성자를 통해 초기화) 
	public Rectangle(int x,int y,int width,int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	// 1. 부모 클래스의 draw 메소드 호출을 통해 x,y좌표 값 출력
	// 2. 사각형 면적, 둘레 값 출력
	// 면적 : 너비 * 높이
	// 둘레 : 2*(너비+높이)
	public void draw() {
		super.draw();
		System.out.println("면적 : "+width*height);
		System.out.println("둘레 : "+2*(width+height));
	}
	
	
	
	
}
