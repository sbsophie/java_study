package com.gn.study.model.vo;

public class Child extends Parent{
	@Override
	public void method() throws IllegalArgumentException,
//		throws Exception{   //부모보다 범위가 넓은 Exception은 사용불가
		 NullPointerException{
		System.out.println("Child");
	}
	
	
	
	
	
	
	
	
}
