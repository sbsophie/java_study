package com.gn.study.controller;

public class Run {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		//예외를 처리하는 try~catch문 사용
		try {
			System.out.println(a/b);			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안돼요!!");
		}finally {
			System.out.println("계산끝!!");
		}
		
//예외		
		System.out.println("======== Null 조심========");
		String[] arr = new String[3];  // 선언과 생성만 한거임
		//System.out.println(arr[0].length()); //초기값을 넣지 않아서 null(비어있음)상태여서 오류뜸
		//System.out.println(null.length());   이렇게 쓴거나 다름없음
		
		//위 오류를 고치려면 아래와 같이 써주기
		try {
			System.out.println(arr[0].length());
		}catch(NullPointerException e) {
			System.out.println("오류가 발생했어요!!");
		}
		
		
		
	}
}
