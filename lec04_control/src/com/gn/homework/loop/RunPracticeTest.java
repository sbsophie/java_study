package com.gn.homework.loop;

import java.util.Scanner;

public class RunPracticeTest {

	public static void main(String[] args) {
		
		
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

}
