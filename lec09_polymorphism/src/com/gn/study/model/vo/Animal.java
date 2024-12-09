package com.gn.study.model.vo;

public abstract class Animal {  //abstract메소드가 포함된 클래스는 반드시 abstract클래스여야 함
	//추상 메소드
	public abstract void sound();
	
	public void breath() {
		System.out.println("동물은 숨을 쉽니다.");
	}
}
