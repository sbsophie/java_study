package com.gn.homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
//		몸무게(kg) : 70.0
//		키(m) : 1.80
//		BMI 지수 : 21.6
//		체질량 지수를 계산하는 공식은 몸무게(kg) / (키(m) * 키(m)) 입니다. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게(kg) : ");
		double num1 = sc.nextDouble();
		System.out.println(num1);
		
		System.out.println("키(m) : ");
		double num2 = sc.nextDouble();
		System.out.printf("%.2f\n", num2);
		
		System.out.printf("BMI지수 : %.1f", num1/(num2*num2));
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몸무게(kg) : ");
//		double one = sc.nextDouble();
//		System.out.print("키(m) : ");
//		double two = sc.nextDouble();
//
////		System.out.println("BMI 지수 : "+(one/(two*two)));
//		System.out.printf("BMI 지수 : %.1f", one/(two*two)); //f열안에 문자열 넣으면됨
		

		
		
		
		
		
	}

}
