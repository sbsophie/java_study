package com.gn.homework.condition;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Practice {
	public void practice01() {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== 놀이동산 입장료 계산하기 ===");
		int age = sc.nextInt();
		System.out.println("나이 : "+age);
		
		if(age > 64) {
			System.out.println("무료");
		} else if(age > 18) {
			System.out.println("당신의 놀이동산 요금은 30000원입니다.");
		} else if(age > 12) {
			System.out.println("당신의 놀이동산 요금은 20000원입니다.");
		} else if(age > 2) {
			System.out.println("당신의 놀이동산 요금은 10000원입니다.");
		} else {
			System.out.println("무료");
		}
		
	}
	
	
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		// 3,4,5월 봄
		// 6,7,8월 여름  (35도 이상이면 폭염 경보, 33도 이상이면 폭염주의보)
		// 9,10,11월 가을
		// 12,1,2월 겨울  (-15도이하면 한파경보, -12도이하이면 한파주의보)
		// 1~12월이 아닌 월 입력시 해당하는 계절이 없다고 알려주기

		System.out.println("=== 일기예보 ===");
		System.out.println("월 : "+month);
		System.out.println("기온 : "+month);
		
		if()
		
		
		
		
		
		
		
		
		
	}
	
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("=== 세개의 정수 비교하기 ===");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void practice04() {
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void practice05() {
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void practice06() {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
