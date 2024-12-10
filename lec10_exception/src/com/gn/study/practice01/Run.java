package com.gn.study.practice01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Practice practice = new Practice();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 : ");
		int firstNum = sc.nextInt();
		
		System.out.println("두번쨰 숫자 : ");
		int secondNum = sc.nextInt();

		
		try {
			System.out.println(practice.divide(firstNum,secondNum));
		}catch(ArithmeticException e) {
			System.out.println("나누기 중 부적절한 연산이 발생했습니다.");
		}finally {
			System.out.println("마지막까지 잘 도착했어요!");
		}
		
		
		
		
		
		
		
		
	}
}
