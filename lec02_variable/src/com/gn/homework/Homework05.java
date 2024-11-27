package com.gn.homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
//		[총점과 평균 계산하기]		
//		실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받으세요.
//		그 다음, 총점과 평균을 출력하세요.이때, 총점과 평균은 정수형으로 처리하세요.
//		
//		실수값을 더할때는 + 부호를, 나누기할 때는 / 부호를 사용합니다.
//		
//		국어 : 89
//		영어 : 73
//		수학 : 45
//		총점 : 207
//		평균 : 69
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double num1 = sc.nextDouble();
		System.out.println(num1);
		
		System.out.print("영어 : ");
		double num2 = sc.nextDouble();
		System.out.println(num2);
		
		System.out.print("수학 : ");
		double num3 = sc.nextDouble();
		System.out.println(num3);
		
		
		
//		double a_num = 88.78;
//		double b_num = 73.88;
//		double c_num = 45.15;
		
		System.out.println(""+(int)(num1+num2+num3)); // (int)num1일경우 num1에만 적용되는거기 때문에 괄호로 적용하고 싶은걸 묶어야 적용이됨
		System.out.println((int)((num1+num2+num3)/3));
		
		
		
//		// 9. 다운캐스팅
//		double d_num = 13.4;
//		int i_num = 4;
//		System.out.println(d_num+i_num);
//		System.out.println((int)d_num+i_num); //정수로 만들고 싶을때

	}

}
