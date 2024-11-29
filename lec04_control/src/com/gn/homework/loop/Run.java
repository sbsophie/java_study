package com.gn.homework.loop;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("실행할 기능을 입력하세요.");
		System.out.println("2. 구구단 무한반복");
		System.out.println("3. 탈출합시다.");
		System.out.println("6. 트리 만들기");
		System.out.println("7. 박수박수박");
		System.out.println("선택 : ");
		
		
		Scanner cs = new Scanner(System.in);
		int menu = cs.nextInt();
		
		Practice practice = new Practice();
		switch(menu) {
			case 2 : practice.practice02();break;
			case 3 : practice.practice03();break;
			case 6 : practice.practice06();break;
			case 7 : practice.practice07();break;
		}
		
		

	}

}
