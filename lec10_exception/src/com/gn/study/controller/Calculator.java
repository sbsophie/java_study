package com.gn.study.controller;

public class Calculator {
	public int divide(int a, int b) {

// 1. 모든 블록에 return을 쓴다.		
//		try {
//			return a/b;
//		}catch(ArithmeticException e) {
//			return -1;
//		}
		
// 2. 임의의 변수를 활용한다.
		int answer = -1;
		try {
			answer = a/b; // answer라는 변수를 재할당
		}catch(ArithmeticException e) {
			e.printStackTrace();  // 여기를 비워놓으면 아래 return answer값이 나옴
			System.out.println(e.getMessage());  // String데이터를 반환하는 아이여서 e.getMessage();이렇게만 쓰면
												// 출력이 안되서 표준출력문안에 넣어줘야함
			System.out.println(e);
		}catch(RuntimeException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return answer;
		
		
		
		
		
		
		
	}
}
