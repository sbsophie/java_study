package com.gn.practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num = sc.nextInt();
		System.out.println(num);
		
		System.out.print("두번쨰 숫자 : ");
		int num2 = sc.nextInt();
		System.out.println(num2);

		int su1 = num;
		int su2 = num2;
		System.out.println("덧셈 : "+(su1+su2));
		System.out.println("뺄셈 : "+(su1-su2));
		System.out.println("곱셈 : "+(su1*su2));
		System.out.println("몫 : "+(su1/su2));
		System.out.println("나머지 : "+(su1%su2));
				
		
//		강사님 답안
//		System.out.print("첫번째 숫자 : ");
//		int one = sc.nextInt();
//		System.out.print("두번쨰 숫자 : ");
//		int two = sc.nextInt();
//		System.out.println("덧셈 : "+(one+two));
//		System.out.println("뺄셈 : "+(one-two));
//		System.out.println("곱셈 : "+(one*two));
//		System.out.println("몫 : "+(one/two));
//		System.out.println("나머지 : "+(one%two));
//		
//		int plus = one+two;
//		System.out.print("덧셈 :"+plus);		
		
		
	}

}
