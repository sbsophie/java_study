package com.gn.practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// 아래 스캐너 입력후 상단 import 넣을때 단축키 : ctrl + shift + 'o'
		Scanner sc = new Scanner(System.in);
		
		System.out.println("조명의 밝기를 입력하세요(0~3) : ");
		int light = sc.nextInt();
		
		//System.out.print("현재 조명의 밝기 : "); 로 작성해도 됨
		//위 출력문에 println이 아닌 print로 사용한건 한줄에 넣어야하게 때문에 그럼
		
		String text = "현재 조명의 밝기 : "; //int a = 5; -> a+=3 결과 8나오는 원리
		switch(light) {
			case 0 : text += "조명을 끕니다.";
				break;
			case 1 : text +="어두운 조명입니다.";
				break;
			case 2 : text +="밝은 조명입니다.";
				break;
			case 3 : text +="매우 밝은 조명입니다.";
				break;
			default : text +="올바른 입력이 아닙니다.";
		}
		System.out.println(text);
		
		
		
		

	}

}
