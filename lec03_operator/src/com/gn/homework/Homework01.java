package com.gn.homework;

import java.util.Scanner;
public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		철수의 앵무새는 주인이 하는 말의 반대말만 하는 똑똑한 새에요.
//		철수의 앵무새 처럼 우리의 프로그램도
//		사용자 입력한 문자열이 “간다”와 같으면 “온다”라고 출력하고,
//		그렇지 않은 경우에는 “간다”라고 출력하는 시스템을 만드세요.
//
//		컴퓨터는 간다의 반댓말이 온다인지 알지 못합니다.
//		‘!간다 == 온다’라고 쓰지 마세요.
//		
//		말해보세요 : 간다
//		앵무새 : 온다

		String talk = sc.next();
		System.out.println("말해보세요 : ");

		if(talk.equals("간다"));{
			System.out.println("온다");
		}
//			else {
//			System.out.println("간다");
//		}
		
		
		
	}

}
