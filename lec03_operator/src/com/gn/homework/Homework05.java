package com.gn.homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
//		주민번호를 입력하면 남자인지 여자인지 출력해주는 프로그램을 구성해주세요.
//		주민번호 7번째 자리의 값이 1 또는 3이면 남성, 2 또는 4이면 여성입니다.
//		가능하다면 1,2,3,4 외의 값을 입력한 경우도 고려해보세요.
//		
//		주민번호(-) : 123456-1234567
//		입력하신 주민번호는 남성입니다.
//		
//		주민번호(-) : 123456-7891234
//		입력하신 주민번호는 잘못된 값입니다.
		
		Scanner sc = new Scanner(System.in);
		
		String na = sc.next();
		char name = na.charAt(7);
		
		if(name == 1) {
			System.out.println("입력하신 주민번호는 남성입니다.");
		} else if(name == 3) {
			System.out.println("입력하신 주민번호는 남성입니다.");
		} else if(name == 2) {
			System.out.println("입력하신 주민번호는 여성입니다.");
		} else if(name == 4) {
			System.out.println("입력하신 주민번호는 여성입니다.");
		} else {
			System.out.println("입력하신 주민번호는 잘못된 값입니다.");
		}
		
		
		
		
		
		
		
		
//		만약 char구문을 사용하고 싶은경우 아래와같이 사용
//		String tar1 = sc.next();
//		char name = tar1.charAt(0);
//		
//		int num = sc.nextInt();
//		System.out.println("머리(cm) : "+num);
		
	}

}
