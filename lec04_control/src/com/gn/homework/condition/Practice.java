package com.gn.homework.condition;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Practice {
	public void practice01() {  //[완료~!!]
		Scanner sc = new Scanner(System.in);

		System.out.println("=== 놀이동산 입장료 계산하기 ===");
		int age = sc.nextInt();
		System.out.println("나이 : "+age);
		
		if(age > 64) {
			System.out.println("무료");
		} else if(age > 18) {
			System.out.println("당신의 놀이동산 요금은 30000원입니다.");
		} else if(age > 12) {
			System.out.println("당신의 놀이동산 요금은 20000원입니다.");
		} else if(age > 2) {
			System.out.println("당신의 놀이동산 요금은 10000원입니다.");
		} else {
			System.out.println("무료");
		}
		
	}
	
	
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		// 3,4,5월 봄
		// 6,7,8월 여름  (35도 이상이면 폭염 경보, 33도 이상이면 폭염주의보)
		// 9,10,11월 가을
		// 12,1,2월 겨울  (-15도이하면 한파경보, -12도이하이면 한파주의보)
		// 1~12월이 아닌 월 입력시 해당하는 계절이 없다고 알려주기

		System.out.println("=== 일기예보 ===");
		System.out.println("월 : "+month);
		System.out.println("기온 : "+month);
		

		
		switch(month) {
		case 1,3,5,7,8,10,12 : System.out.println("31일");break;
		case 4,6,9,11 : System.out.println("30일");break;
//		case 4:case 6:case 9:case 11: System.out.println("30");break;
		case 2: System.out.println("28일");break;
		default:System.out.println("존재하지 않는 달입니다.");
		}
		
		
		
		
		
		
		
		
	}
	
	
	public void practice03() {   //[완료~!!]
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("=== 세개의 정수 비교하기 ===");
		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.println("세 번째 정수 : ");
		int num3 = sc.nextInt();
		
		int small = (num1 > num2) ? (num1 > num3 ? num3 :num1 ) : (num2 > num3 ? num3 : num2);
		System.out.println("세 수 중에서 가장 작은 수는 "+small+"입니다.");
		
	}
	
	
	public void practice04() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 철수네 공장 ===");
		System.out.println("수집된 코드");
		
		int code = sc.nextInt();
		String text ="";
		switch(code) {
			case 1 : text = "잘못된 요청입니다.";break;
			case 2 : text = "요청하신 서비스를 찾을 수 없습니다.";break;
			case 3 : text = "처리 방법을 알 수 없는 문제가 발생했습니다.";break;
			case 4 : text = "일시적인 서버 오류가 발생하였습니다.";break;
			default : text = "알 수 없는 오류가 발생하였습니다.";break;		
		}
		
		

	}
	
	
	public void practice05() {   //[완료~!!]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 헬스 마니아 철수 ===");
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 플업");
		System.out.println("5. 종료");
		
		int number = sc.nextInt();
		
		if(number == 1) {
			System.out.println("스쿼트 운동 시간입니다.");
		} else if(number == 2) {
			System.out.println("데드리프트 운동 시간입니다.");
		} else if(number == 3) {
			System.out.println("벤치 프레스 운동 시간입니다.");
		} else if(number == 4) {
			System.out.println("풀업 운동 시간입니다..");
		} else if(number == 5) {
			System.out.println("오늘고 수고하셨습니다.");
		} else if(number <= 0){
			System.out.println("양수만 입력해주세요.");
		} else {
			System.out.println("목록에 있는 숫자만 입력해주세요.");
		}
		
		
	}
	
	
	public void practice06() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 합격인가? 불합격인가? ===");
		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.println("소프트웨어설계 점수:");
		System.out.println("소프트웨어개발 점수:");
		System.out.println("데이터베이스구축 점수:");
		System.out.println("프로그래밍언어활용 점수: ");
		System.out.println("정보시스템구축관리 점수: ");
		int score = sc.nextInt();
		
		if(score > 40) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
