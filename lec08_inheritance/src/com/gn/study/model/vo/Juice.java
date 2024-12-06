package com.gn.study.model.vo;

public class Juice extends Beverage {
	private String fruit;
	
	public Juice(String name,int volume,String fruit) {
		super(name,volume);
		this.fruit = fruit;
	}
	
	//주스 정보넣기(출력)
	public void juiceInfo() {
		super.printInfo(); //부모가 가지고 있는 필드나 메소드를 직접 접근할 수 있다
		System.out.println("- 과일: "+fruit);
	}
	
	
}
