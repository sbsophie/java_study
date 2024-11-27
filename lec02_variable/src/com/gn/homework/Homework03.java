package com.gn.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {		
//		문제 : Scanner로 문자열을 입력 받으세요.
//		그 다음, 해당 문자열의 첫번째, 두번째, 세번째 문자를 출력해주는 시스템을 만들어주세요.

//		문자열을 입력하세요 : apple
//		첫번째 문자 : a
//		두번째 문자 : p
//		세번째 문자 : p
		
		Scanner sc = new Scanner(System.in);
//		String text = new String("apple");
		System.out.print("문자열을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println(name);
		
//		String word = "apple";  위에 스캐너로 했기때문에 문자값을 만들필요가 없음
		char name1 = name.charAt(0);
		System.out.println("첫번째 문자 : "+name1);
		char name2 = name.charAt(1);
		System.out.println("두번째 문자 : "+name2);
		char name3 = name.charAt(2);
		System.out.println("세번째 문자 : "+name3);
		
		
//		// 7. charAt(n)  'n'에는 숫자가 들어가야함
//				String word = "Hello";
//				char first = word.charAt(0);
//				System.out.println(first);
		
		

	}

}
