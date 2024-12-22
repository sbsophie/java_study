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
		
		System.out.println("영어 이름 : ");
		String name1 = sc.next();
		boolean bool = "Chulsu".equals(name1);
		System.out.println(bool);
		
		System.out.println("20대 이신가요? : ");
		int num = sc.nextInt();
		boolean bool2 = num >= 20 && num <= 29;
		System.out.println(bool2);
		
		
		

		
		
	}

}
