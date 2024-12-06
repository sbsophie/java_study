package com.gn.practice03.model.vo;

public class Point {
	private int x;
	private int y;
	
	// 기본생성자
	public Point() {}
	
	//매개변수 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//x,y좌표 값을 출력하는 메소드
	public void draw() {
		System.out.println("(x, y) : "+"("+x+":"+y+")");
	}
	
	
	
	
	
}
