package com.gn.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
//		구슬의 개수를 키보드로 입력 받으세요.
//		그리고, 구슬의 개수가 짝수인지 홀수인지 출력하세요.
//		특정 숫자를 2로 나눴을때 나머지가 0이면 짝수, 1이면 홀수입니다.
//		
//		구슬의 개수 : 3
//		구슬의 개수는 홀수입니다.
		
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		System.out.println("구슬의 개수 : "+su);
		
		int num = su;
		if(num % 2 == 0) {
			System.out.println("구슬의 개수는 짝수입니다.");
		} else {
			System.out.println("구슬의 개수는 홀수입니다.");
		}
		
		
	}

}
