package com.gn.homework.test;

import java.util.Scanner;

// 기능 메소드
public class Practice {
	// 1번 기능 : 인사말 출력
	public void practice01() {
		System.out.println("안녕하세요~");
	}
	// 2번 기능 : 두개의 숫자를 입력 받아서 합 출력	
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		int na = sc.nextInt();
		int na2 = sc.nextInt();
		System.out.println(na+na2);
		sc.close();  //스캐너(터널)을 닫아주는 역할
	}
}


