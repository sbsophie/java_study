package com.gn.study.model.vo;

public class Child extends Parent{
	private int b;
	
	public Child() {
		super();
		System.out.println("자식 기본 생성자 호출!!");
	}
	public Child(int b) {   // super사용시 매개변수 넣는란에 (int a, int b)라고 넣고 아래 super 넣기
//		super(a);
		this.b = b;
		System.out.println("자식 매개변수 생성자 호출~~");
	}
	
	
	
}
