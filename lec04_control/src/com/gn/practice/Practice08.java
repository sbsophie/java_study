package com.gn.practice;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		
//		int num = 0;
//		for(int i = 2; i <= 9; i++) {
//			if(num == 45) {
//				break;
//			}
//			System.out.println("==="+i+"단===");
//			for(int j = 1; j <=9; j++) {
//				num = i*j;
//				System.out.println(i+" * "+j+" = "+(i*j));
//			}
//			System.out.println("계산 결과가 "+num+"입니다.");
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수(1~50) : ");
//		int num = sc.nextInt();
//		for(int i = 0; i < 3; i++) {
//			if(num < 0) {
//				System.out.println("1~50 사이의 정수를 입력하세요.");
//			} else if(num > 50) {
//				System.out.println("1~50 사이의 정수를 입력하세요.");
//			} else if(num % 2 == 0) {
//				System.out.println("합계 :"+num);
//			}
//				
//		}
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 : ");
//		int num = sc.nextInt();
//	
//		if(num < 0) {
//			System.out.println("양수만 입력해주세요.");
//		} else if(num > 9) {
//			System.out.println("9이하의 숫자를 입력해주세요.");
//		} else if(num == 0){
//			System.out.println("프로그램을 종료하세요");
//		} else {
//			
//		}
		
		
		
		for(int i = 1; i < 10; i+=2) {
			for(int j = 9; j > i; j-=2) {
				System.out.print(" ");
				} 
			for(int j = 0; j < i; j++) {		
				System.out.print("*");
				}
			System.out.println();
			} 
			
		
		
//		int test = 0;
//		
//		for(int i = 2; i <= 9; i++) {
//			if(test == 27) {
//				break;
//			}
//			System.out.println("==="+i+"단 ===");
//			for(int j = 1 ; j <=9; j++) {
//				test = i *j;
//			System.out.println(i+ " * "+ j +" = "+(i*j));
//			}
//
//		}
		
		
		
		
		
		

	}

}
