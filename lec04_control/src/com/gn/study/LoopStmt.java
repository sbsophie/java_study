package com.gn.study;

public class LoopStmt {

	public static void main(String[] args) {
// 1. for문
		// 표현 수식 -> for(초기식; 조건식; 증감식{}
		
		// 1 ~ 10까지 숫자를 모두 출력하고 싶을때
		// 초기식 -> 출발점(1)
		// 조건식 -> 도착점(10)
		// 증감식 -> step(몇걸음씩)
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i);
		}
		
// 2. 초기식 생략	
		int a = 1;
		for(; a <= 5 ; a++) {
			System.out.println(a);
		}
	
// 3. 조건식 생략 
//무한루프
		for(int i = 1; ; i++) {
			System.out.println(i);
			if(i >= 10) {
				break;
			}
		}
		
//4. 중첩 for문
		// i는 1~2 까지 하나씩 커지면서 반복
		// j는 1~3 까지 하나씩 커지면서 반복
		// 결과값 : A B B B C A B B B C
		for(int i =1 ; i <= 2 ; i++) {
			System.out.println("A");
			for(int j = 1 ; j <= 3; j++) {
				System.out.println("B");
			}
			System.out.println("C");
		}
		
// 5. 중첩 for문 활용
		// ****
		// ****
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
// 6. break를 사용한 중첩 for문
		// 외부 : 0에서 부터 2 미만(=제외) 1씩 커지면서 반복
		// 내부 : 0에서 부터 3 미만(=제외) 1씩 커지면서 반복
		for(int i = 0; i < 2; i++) {
			System.out.print("1");
			for(int j = 0; j < 3; j++) {
				System.out.print("2");
				// break;  내부 for문에 break를 걸면 반복이 멈춤
			}
			System.out.print("3\n");
			break;
		}
		
// 7. while문
		int start = 1;
//		while(start <= 10) {
//			System.out.println(start);
//			start++;
//		}
		while(true) {
			System.out.println(start);
			start++;
			if(start > 10) {
				break;
			}
		}
		
// 8. do~while문
		int count1 = 10;
		while(count1 > 0 && count1 < 10) {
			System.out.println("while문 출력");
			count1--;
		}
		
		int count2 = 10;
		do {
			System.out.println("do~while문 출력");
			count2--;
		}while(count2 > 0 && count2 < 10);
		
// 9. continue
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		// 출력 : 1,3,5,7,9 가 나옴
		
		String str = "김철수";
		for(int i = 0 ; i < str.length(); i ++) {
			System.out.println(str.charAt(i));
		}
		
		

		
		
		
		
		
		
	}

}
