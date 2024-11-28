package com.gn.practice;

import java.util.Scanner;
public class Practice02 {

	public static void main(String[] args) {
//		90점보다 높은 경우 : A
//		80(X) ~ 90(O)점 사이 : B
//		70(X) ~ 80(O)점 사이 : C
//		60(X) ~ 70(O)점 사이 : D
//		나머지 : F
//		
//		성적 입력 : **85**
//		당신의 학점은 B입니다.
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("성적 입력 : ");
		
//		int a = 90;  <-스캐너로 입력하는 정보가 들어가기 때문에 이건 필요없음
		if(num > 90) {
			System.out.println("당신의 학점은 A입니다.");
		} else if(num > 80) {
			System.out.println("당신의 학점은 B입니다.");
		} else if(num > 70) {
			System.out.println("당신의 학점은 C입니다.");
		} else if(num > 60) {
			System.out.println("당신의 학점은 D입니다.");
		} else {
			System.out.println("당신의 학점은 F입니다.");
		}
		
		
		// char c;  / String grade;로 입력시 ""사용
		// c = '학점 알파벳입력';
		// if절 빠져나와서 출력("문자"+c+"문자");


		
	}

}
