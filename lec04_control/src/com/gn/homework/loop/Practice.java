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
	
	
	public void practice03() {  // [완료~!!!] -> for문 사용을 하지않음....
		Scanner sc = new Scanner(System.in);
		String answer ="";
			
		do {
			System.out.println("입력 : ");
			answer = sc.nextLine();
			System.out.println(answer);
			if(answer.equals("탈출")) {
				System.out.println("프로그램 종료");break;
			}		
		}while(true);
		
	}
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		String na = "";
//		
//		for(String na = na; ; na++) {
//			System.out.println("입력 : ");
//			na = sc.next();
//			if(na.equals("탈출")) {
//				System.out.println("프로그램 종료");
//			}
//		}
		

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
		 Scanner sc = new Scanner(System.in);
		 int 
		 
		 System.out.println();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void practice06() {  // [완료~!!!]
		
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

	
	public void practice07() {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void practice08() {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
		
}
