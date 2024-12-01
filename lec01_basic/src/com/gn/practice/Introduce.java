package com.gn.practice;

public class Introduce {
	public static void main(String[] args) {
		// 1. print만 사용
		System.out.print("안녕하세요~\n저는 \"김철수\"입니다.\n나이는 20살이고, mbti는 istp입니다.\n");
		// 2. println만 사용
		System.out.println("안녕하세요~");
		System.out.println("저는 \"김철수\"입니다.");
		System.out.println("나이는 20살이고, mbti는 istp입니다.");
		// 3. printf만 사용
		// 문자열 : %s, 정수 : %d, 실수 : %f,
		// 문자열 입력시에는 "" 해줘야함
		// printf(표현식,데이터)에서 ,와 "등 확인 잘 하기
		System.out.printf("안녕하세요~\n저는 %s입니다.\n나이는 %d살이고, mbti는 %s입니다."
				,"\"김철수\"",20,"istp");
		
		System.out.printf("안녕하세요 저는 %s입m니다. 나이는 %d이고 몸무게는 %d입니다.","박수빈",32,49);
		
		
		
	}

}
