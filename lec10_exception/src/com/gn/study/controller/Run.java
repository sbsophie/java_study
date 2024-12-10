package com.gn.study.controller;

import com.gn.study.model.vo.Account;
import com.gn.study.model.vo.InsufficientBalanceException;
import com.gn.study.model.vo.User;

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
		
//예외(Null)		
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
//예외(배열)		
		System.out.println("======== 배열 조심 =========");
		int[] numbers = {1,2,3};  // 선언과 생성과 초기화 한거임
		//System.out.println(numbers[3]);  // 배열을 길이를 초과한 인덱스를 사용해여 오류뜸
		
		// 위 오류를 고치려면 아래와 같이 써주기
		try {			
			System.out.println(numbers[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이를 초과한 인덱스를 쓰셨네요!!");
		}
		
		
//예외 출력메소드(1)
		// printStackTrace()  -> 예외의 발생 위치와 원인을 출력하는 메소드(제일 많이 사용,디버깅가능)
		Calculator c = new Calculator();
		c.divide(3, 0);
		// getMessage()   -> 예외의 요약정보를 확인할 수 있음
		// toString()   -> 메소드를 쓰지 않고 참조변수명만 쓰면됨 
		
// 다중 catch
		//급이 낮은애들부터 먼저 써줘야함
		//catch문을 다중으로 쓰려면 Exception은 모든 오류를 다 통틀어서 말하는 것이기 때문에 맨 나중에 써줘야함
		//RuntimeException(arithmetic,NullPoint,ArryIndexOutOfBound) < Exception
		
//throw  강제로 예외를 발생시키는 방법
		//표현법  :  throw new 예외클래스이름("예외 메시지");
		User u = new User();
		try {
			u.checkAge(18);			
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		try{
			u.nameLength(null);			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("확인!!");
		
		
		//객체화
		Account ac = new Account("김철수",1000);
		try{
			ac.withdraw(5000);
		}catch(InsufficientBalanceException e) {
			e.printStackTrace();
		}	
		
		
		
		
		
		
	}
}
