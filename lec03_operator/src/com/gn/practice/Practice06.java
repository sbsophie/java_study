package com.gn.practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		사용자로부터 두 개의 정수를 입력 받습니다.
//		삼항 연산자를 사용해서 두 수중에서 작은 수를 찾아서 출력하세요.
//		첫번째 : **4**
//		두번째 : **57**
//		두 수 중에서 작은 수는? 4
		
		System.out.println("첫번째 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 : ");
		int num2 = sc.nextInt();
		
		int result = num1 < num2 ? num1 : num2;
		System.out.println(result);
		
	
		
//		System.out.print("첫번째 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 : ");
//		int num2 = sc.nextInt();
//		
//		int result = num2 < num1 ? num2 : num1;
//		// 57 < 4 ? 57 : 4
//		//          예 : 아니요
//		
//		System.out.println("두 수 중에서 작은 수는?"+result);		
//		System.out.println("두 수 중에서 작은 수는?"+(num < num2));
		
		
		
		
//		int x = 5;
//		int y = 10;
//		boolean result = x > y;
//		
//		// x랑 y중에서 더 큰 값을 출력하고 싶을때
//		// 조건식 ? true일때 결과로 쓸 값 : false일때 결과로 쓸 값
//		int max = x > y ? x : y;
//		System.out.println(x > y ? x :y);
		
		
		
		
	}

}
