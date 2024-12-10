package com.gn.study.practice02;

public class Practice {
	
	public void printStrLength() {
		String[] str = new String[4];
		System.out.println(str[0].length());	
		
		try {
			System.out.println(str[0].length());
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	
	}
// 답안
	// 메소드
	// 메소드명 : printStrLength
	// 매개변수 : 참조형변수 -> String
	public void printStrLength(String str) {
		//str.length();
		try {
			str.length();
		}catch(NullPointerException e) {
			System.out.println("NullPointerException 발생 : "+e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
}
