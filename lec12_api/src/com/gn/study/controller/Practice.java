package com.gn.study.controller;

public class Practice {
	// 매개변수로 전달받은 문자열을 StringBuilder에 append해서
	// 문자열을 반화하는 메소드를 만드는 방법
	public String test(String str) {
		StringBuilder sb = new StringBuilder("test");
		sb.append(str);
		return sb.toString(); //반환형을 return하려고하면 toString 사용해야함
	}
	
	
	
	
	
	
	
	
	
	
	
}
