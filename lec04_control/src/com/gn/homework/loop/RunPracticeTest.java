package com.gn.homework.loop;

import java.util.Scanner;

public class RunPracticeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int sum = 0;
//		while(true) {
//			System.out.println("정수 : ");
//			sum = sc.nextInt();
//			if(sum <= 0) {
//				System.out.println("양수가 아닙니다.");
//			} else {
//				for(int i = 1; i <= sum; i++) {
//					if(i % 2 == 1) {
//						System.out.print("박");
//					} else {
//						System.out.print("수");
//					}
//				}
//				break;
//			}
//		}
		
//		String text = sc.next();
	
		int tall1 = 152;
		int tall2 = 180;
		int tall3 = 165;
		int tall4 = 158;
		int tall5 = 171;
		
		int[] tall = {152,180,165,158,171};
		
		int[] num;
		num = new int[5];
		
		//0 -> 1,2,3,4
		//1-> 2,3,4
		//2-> 3,4
		//3-> 4
		
		for(int i = 0; i < tall.length-1; i++) {
			for(int j = i+1; j < tall.length; j++) {
				if(tall[i] > tall[j]) {
					int temp = tall[i];
					tall[i] = tall[j];
					tall[j] = temp;
				}
			}
			System.out.println(tall);
		}
		
		
		
		
		

	}
}
