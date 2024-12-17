package com.gn.practice03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
//		출력예시
//		단어를 입력하세요: **brown**
//		brown 다음 단어: fox
		
//		사용자로부터 문자열 입력 받기
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		입력받은 단어가 sentence에 존재하는지 확인
		String sentence = "the quick brown fox jumps over the lazy dog";
		if(sentence.indexOf(str) != -1) {
			System.out.println(str);
		}else {
			System.out.println("존재하지 않는 단어입니다.");
		}
//		일치하는 단어가 있으면 해당 단어 출력
//		없으면 "존재하지 않는 단어입니다." 출력
		
		

		
		
	}
}
