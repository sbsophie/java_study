package com.gn.practice02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		출력예시
//		문자열(1):**lemon**
//		문자열(2):**mango**
//		문자열(3):**apple**
//		mangomango
//		문자열(1):**grape**
//		문자열(2):**strawberry**
//		문자열(3):**cherry**
//		strawberrystrawberry
		
//		사용자로부터 세 개의 문자열을 입력 받습니다.
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
//		세개의 문자열의 길이를 비교하여 가장 긴 문자열을 2번 연결한 다음 출력하세요.
		String result = "";
//		String[] arr = new String[3];
//		arr[0] = str1;
//		arr[1] = str2;
//		arr[2] = str3;
		for(int i =0; i<str1.length();i++) {
			for(int j = 0; j <str2.length(); j++) {
				if(i < j) {
					System.out.println(str2);
				}else {
					System.out.println(str1);
				}
			}
		}
		
//		if(str1.length() < str2.length()) {
//			if(str2.length() < str3.length()) {
//				System.out.println(str3.length());
//			}
//		}
		
		
//		만일, 가장 길이가 문자열과 길이가 동일한 문자열이 있다면 사전순으로 더 뒤에 있는 문자열을 2번 출력하세요.
		
				
		

		
		
		
		
		
		
		
		
	}
}
