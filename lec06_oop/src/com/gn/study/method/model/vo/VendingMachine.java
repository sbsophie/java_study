package com.gn.study.method.model.vo;

public class VendingMachine {
	// 1. 인사
	public void sayHi() {
		System.out.println("환영합니다~");
	}
	// 2. 남아있는 잔돈(기본형) 리턴
	public int getBalance() {
//		int balance = 500;
//		return balance;
		return 500; //이것처럼 써줘도 되고 위와 같이 써줘도 됨 
	}
	// 3. 음료수 종류(배열) 리턴
	public String[] sodaList() {
//		String[] arr = new String[] {"콜라","사이다","오렌지 주수"};
//		return arr;
		return new String[] {"콜라","사이다","오렌지 주수"}; //이것처럼 써줘도 되고 위와 같이 써줘도 됨 
	}
	
	// 4. 선택된 음료수 객체를(클래스) 리턴
	// soda s1 = new Soda();
	// int balance = 500;
	public Soda selectedSoda() {
//		Soda s1 = new Soda();
//		return s1;
		return new Soda();  //이것처럼 써줘도 되고 위와 같이 써줘도 됨
	}
	
	
	
	
}
