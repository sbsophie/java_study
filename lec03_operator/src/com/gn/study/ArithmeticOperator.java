package com.gn.study;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// 1. 산술 연산자
		int su1 = 10;
		int su2 = 3;
		System.out.println(su1+su2);
		System.out.println(su1-su2);
		System.out.println(su1*su2);
		System.out.println(su1/su2);
		System.out.println(su1%su2);

		// 2. 복합 대입 연산자
		int a = 5;
//		a = a + 3;
		a += 3;
		System.out.println(a);
		
		int b = 10;
		b -= 4;
		// 위 연산으로인해 b의 값이 6으로 변경되어 아래 도출값이 30으로 나옴
		b *= 5;
		System.out.println(b);
		
		int c = 10;
		c /= 3;
		
		int d =10;
		d %= 3;
		
		
		
	}

}
