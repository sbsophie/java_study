package com.gn.practice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
//		우리반은 철수, 영희, 길동이 3명으로 이루어져 있습니다.
//		시험이 있는 날 길동이가 결석하여 철수, 영희만 시험을 보았습니다.
//		선생님은 학생들 성적의 총점과 평균을 계산하기 위해서 배열 scores를 만들었는대요.
//		우선 철수와 영희의 점수를 초기화하였습니다.
//		다음날 길동이도 출석하여 시험을 보았습니다.
//		선생님이 키보드로 길동이의 성적을 입력하면 3 학생의 성적을 모두 담고 있는 새로운 배열을 구성하세요.
//		그 다음 학생들의 성적을 출력하세요.
//		기존의 scores 배열에는 영향이 없어야 합니다.
//		
//		길동이 : **81**
//		54
//		23
//		81
//		
//		총합 : 158
//		평균 : 52
		
		Scanner sc = new Scanner(System.in);
		System.out.println("길동이 : ");
		int arr = sc.nextInt();
		
		int[] scores1 = {54,23};
		int[] scores2 = new int[scores1.length+1]; //[3] 칸맞추기
		
		for(int i = 0; i < scores2.length-1; i++) {   // 기차칸(데이터) 맞추기
			scores2[i] = scores1[i];
		}
		scores2[2] = arr;  // 기차 3번째 칸 값을 만들어주기 
		
		for(int su1 : scores1) {
			System.out.println(su1);
		}
		System.out.println();
		for(int su2 : scores2) {
			System.out.println(su2);
		}
		
		
		

		
		
		
		
		
		
		

	}

}
