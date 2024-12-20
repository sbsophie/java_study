package com.gn.homework11;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH시 mm분 ss초"); 
		System.out.println(dtf.format(start));
		
		
		while(true) {
			System.out.println("입력 : ");
			String str = sc.next();
			if("Y".equals(str.toUpperCase())) {
				long diff = ChronoUnit.SECONDS.between(start, LocalDateTime.now());
				System.out.println("경과(초) : "+diff);
			}else if("N".equals(str.toUpperCase())) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
		sc.close();
		
		
	}
}
