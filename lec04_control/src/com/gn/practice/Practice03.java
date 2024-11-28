package com.gn.practice;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		철수네 학교는 두발 검사가 있는 학교에요.
//		여학생은 귀밑 7cm, 남학생은 귀밑 3cm를 원칙으로 삼고 있어요.
//		학생의 성별과 머리 길이를 키보드로 입력 받아서
//		합격, 불합격 여부를 출력하는 프로그램을 만들어주세요.
//		여학생은 머리 길이가 7cm 이하이면 합격이고,
//		남학생은 3cm 이하이면 합격입니다.
//
//		성별(F/M) : **F**		성별(F/M) : **M**
//		머리(cm) : **3**		머리(cm) : **20**
//		합격입니다.		  불합격입니다.
		
		String tar1 = sc.next();
		System.out.println("성별(F/M) : "+tar1);
		
		int num = sc.nextInt();
		System.out.println("머리(cm) : "+num);
		
		
//		char sex;
		if(tar1.equals("F")) {
			if(num > 7) {
				System.out.println("불합격입니다.");
			} else {
				System.out.println("합격입니다.");
			}
		} else if(tar1.equals("M")) {
			if(num > 3) {
				System.out.println("불합격입니다.");
			} else {
				System.out.println("합격입니다.");
			}
		}

//		만약 char구문을 사용하고 싶은경우 아래와같이 사용
//		String tar1 = sc.next();
//		char name = tar1.charAt(0);
//		
//		int num = sc.nextInt();
//		System.out.println("머리(cm) : "+num);
//		
//		
//		if(name == 'F') {
//			if(num > 7) {
//				System.out.println("불합격입니다.");
//			} else {
//				System.out.println("합격입니다.");
//			}
//		} else if(name =='M') {
//			if(num > 3) {
//				System.out.println("불합격입니다.");
//			} else {
//				System.out.println("합격입니다.");
//			}
//		}
		
		
		
	}

}
