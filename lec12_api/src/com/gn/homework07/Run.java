package com.gn.homework07;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
//		1~100사이의 숫자 중에서 랜덤값을 추출하여 변수에 담으세요.
//		사용자로부터 숫자를 입력 받습니다. 
//		그다음 사용자가 랜덤값을 맞추는 데까지 몇번이 걸렸는지 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int rnd = (int)(Math.random()*100)+1;
		int count = 0;

		System.out.println("1~100 사이의 임의의 난수를 맞춰보세요");
		
		while(true) {
			System.out.println("숫자를 입력하세요: ");
			int answer = sc.nextInt();
			count++;
			
			if(answer < rnd) {
				System.out.println("UP !");
			} else if(answer > rnd) {
				System.out.println("DOWN !");
			} else {
				System.out.println("정답입니다!!");
			}
		} 

		
		
	}
}
