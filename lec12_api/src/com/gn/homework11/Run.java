package com.gn.homework11;

import java.time.LocalTime;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
//		- 처음 시스템을 실행했을 때 시간값을 LocalTime 타입 변수 start에 담으세요.
//		- start 변수의 값을 출력 예시와 같이 출력합니다.
//		- 키보드로 값을 입력 받습니다.
//		- 입력받은 값이 y또는 Y일 경우 기준 시간값으로부터 경과 시간(초)를 출력합니다.
//		- 입력받은 값이 n또는 N일 경우 기능을 종료합니다.
//		- 입력받은 값이 그 외의 경우 “다시 입력해주세요.”라고 출력합니다.

//		기준 : 08시 51분 22초
//		입력 : a
//		다시 입력해주세요.
//		입력 : Y
//		경과(초) : 7
//		입력 : y
//		경과(초) : 8
//		입력 : n
//		종료합니다.
		Scanner sc = new Scanner(System.in);
		
		
		LocalTime start = LocalTime.now();
		System.out.println("기준 : "+start);
		
		long before = System.currentTimeMillis();

		System.out.println("입력 : ");
		String name = sc.next();
		
		
		for(int i =0; i < name.length(); i++) {
		if(name.equals("Y")) {
			long after1 = System.currentTimeMillis();
			System.out.println((after1-before));
		}else if(name.equals("y")){
			long after2 = System.currentTimeMillis();
			System.out.println(after2-before);
		}else if(name.equals("n")) {
			System.out.println("종료합니다.");
		}else {
			System.out.println("다시 입력해주세요.");
		}

		
		}
		
		
				
		
		
		
		
	}
}
