package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수(1~50) : ");
		int num = sc.nextInt();
			if(num > 0) {
				System.out.println("1~50 사이의 정수를 입력하세요.");
			} else if(num < 0) {
				System.out.println("1~50 사이의 정수를 입력하세요.");
			} else if(num % 2 == 0) {
				System.out.println("합계 :"+num);
			}
				
		
		
			// 반복 , 짝수의 합 출력부분 해결해야함
		
	}
	
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num = sc.nextInt();
	
		if(num < 0) {
			System.out.println("양수만 입력해주세요.");
		} else if(num > 9) {
			System.out.println("9이하의 숫자를 입력해주세요.");
		} else if(num == 0){
			System.out.println("프로그램을 종료하세요");
		} else {
			
		}
		
		
		int num1 = 0;
		for(int i =1; i <= 9; i++) {
			System.out.println("==="+i+"단"+ "===");
			for(int j = 1; j <= 9; j++) {
				num1 = i*j;
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
		

			// 입력받은 숫자에 해당하는 단부터 구구단 출력, 사용자가 다시 값을 입력할 수 있도록 출력
		
				
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
		
	public void practice04() {
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();
//1		
		String po = "yes";
		do {
			System.out.println("게임을 실행합니다!\n게임을 다시 플레이하시겠습니까?(yes/no)");
		}while(true) {
			System.out.println(po);
			if((po.equals(answer)){
				break;
			}
		}
	
		
//2		
		String po = "yes";
		do {
			System.out.println("게임을 실행합니다!\n게임을 다시 플레이하시겠습니까?(yes/no)");
		}while(po.equals(answer));
		System.out.println(answer);
		
		
//		answer++; ?? break??
		
		
		
		// 반복 입력할 수 있게 하는거 해결해야함
	}
	
	public void practice05() {
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void practice06() {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j++) {
				if(i < j) {
					System.out.println(" ");
				} else {
					System.out.print("*");
				}
			} 
			System.out.print("\n");
		}
		
		
		
		
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
		int num = sc.nextInt();
		
		
		
		
		
		
		
		
	}
			
	public void practice08() {
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
	
	
	
	
	
	
	
	
	
		
		
		
	}


}
