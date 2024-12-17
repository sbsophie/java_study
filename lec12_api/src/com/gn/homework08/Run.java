package com.gn.homework08;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
//		- 사용자로부터 소수점이 있는 숫자와 10의 제곱수를 입력 받습니다.
//		- 입력받은 제곱수만큼 자리수에서 소수점을 반올림하여 출력합니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("소수점이 있는 숫자: ");
		double num = sc.nextDouble();
		System.out.println("10의 제곱수: ");
		int multi = sc.nextInt();
		
		// 3단계로 나눠서 구하는 방법
//		double multi2 = num*Math.pow(10, multi);
//		double half = Math.round(multi2);
//		double div = half/Math.pow(10, multi);
//		System.out.println(div);

		// 한번에 구하는 방법  : 위 multi를 넣어줬던 부분에 제곱식을 넣어야함
		double d = Math.round(num*Math.pow(10, multi))/Math.pow(10, multi);
		System.out.println(d);
		
		
		
		
		
		
		
		
		
	}
}
