package com.gn.practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 철수가 여권을 만들려고 합니다.
		// 영어 이름 : Chulsu?
		// 20대 이신가요?
		// 1. 철수의 영어 이름과 나이 정보를 입력받습니다.
		// 2. 3가지 논리형 데이터 출력
		
		// (1) 영어 이름이 일치하나요? true
		// (2) 20대 인가요? false
		// (3) 영어 이름이 일치하면서 동시에 20대인가요? false
		
//		System.out.print("영어 이름 : ");
		String name = sc.nextLine();
		boolean bool = "Chulsu".equals(name);
		System.out.println(bool);
		
//		System.out.print("나이 : ");
		int age = sc.nextInt();
		boolean bool2 = 20 <= age && age <= 29;
		System.out.println(bool2);

		
		
		

		
//		int a = 6;
//		int b = 5;
//		int c = 7;
//		
//		// (1) AND(&&) : 6은 5보다 크고, 그리고 6은 7보다 큰가요?
//		boolean andBool = a > b && a > c;
//		System.out.println(andBool);
//		
//		// (2) OR(||) : 6은 5보다 크고, 또는 6은 7보다 큰가요?
//		boolean orBool = a > b || a > c;
//		System.out.println(orBool);
		
		
	}

}
