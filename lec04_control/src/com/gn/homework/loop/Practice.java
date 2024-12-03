package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	public void practice01() { // [완료~!!!]
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		
		do {
			System.out.println("정수(1~50) : ");
			su = sc.nextInt();
			if(su < 0) {
				System.out.println("1~50 사이의 정수를 입력하세요.");
			} else if(su > 50) {
				System.out.println("1~50 사이의 정수를 입력하세요");
			} else {
				int sum = 0;
				for(int i = 1; i <= su; i++) {
					if(i % 2 == 0) {
						sum += i;
					}
			 	 }
				System.out.println("합계 : "+sum);break;
			}	
		}while(true);
						
	}
	
	
	public void practice02() {    // [완료~!!!!]
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		do {
			System.out.println("숫자 : ");
			su = sc.nextInt();
			if(su < 0) {
				System.out.println("양수만 입력해주세요.");
			} else if(su > 9) {
				System.out.println("9이하의 숫자를 입력해주세요.");
			} else if(su == 0){
				System.out.println("프로그램을 종료하세요");
			} else {
				for(su =su; su <= 9; su++) {
					System.out.println("==="+su+"단"+ "===");
					for(int j = 1; j <= 9; j++) {
						System.out.println(su+" * "+j+" = "+(su*j));
					}
				}
			}
		}while(su != 0); 
				
	}
	
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String str = sc.next();
		System.out.println(str);
		
		for(int i = 1; ; i++) {
			System.out.println("입력 : ");
		}
		
		if(str =="탈출") {
			System.out.println("프로그램 종료");
		}
		
		
		
		
//		String name = sc.nextLine();
//		boolean bool = "Chulsu".equals(name);
//		System.out.println(bool);
	
	}
		
	public void practice04() {  // [완료~!!!]
		Scanner sc = new Scanner(System.in);
		String answer ="";
			
		do {
			System.out.println("게임을 실행합니다!\n게임을 다시 플레이하시겠습니까?(yes/no)");
			answer = sc.nextLine();
		}while(answer.equals("yes"));
		
		if(answer.equals("no")) {
			System.out.println("게임을 종료합니다.");
		}		
	}
	
	
	public void practice05() {
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void practice06() {
		
		for(int i = 1; i < 10; i+=2) {
			for(int j = 9; j > i; j-=2) {
				System.out.print(" ");
				} 
			for(int j = 0; j < i; j++) {		
				System.out.print("*");
				}
			System.out.println();
			}
	}


	
	
	
	
	
	
	
	
	
	
	
	
}
