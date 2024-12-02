package com.gn.practice;

public class Practice04 {

	public static void main(String[] args) {
//		다섯명 학생의 나이를 저장한 배열 ages가 있습니다.
//		이 학생들 중 가장 나이가 많은 학생의 나이를 찾아서 출력하세요.
//		위 지시사항을 완료하시면 가장 나이가 어린 학생도 찾아보세요.
//		
//		int[] ages = {20, 18, 22, 19, 21};
//		
//		가장 나이가 많은 학생의 나이 : 22
//		가장 어린 학생의 나이 : 18
		
		int[] ages = {20,18,22,19,21};
		int max = ages[0];   // 20이 기준이 되게 되는거임
		for(int i = 0; i < ages.length; i++) {
			if(ages[i] > max) {
				max = ages[i];
			}
			// 이자리에 최소값 넣는 아래 if 넣으면됨
		}
		System.out.println("가장 나이가 많은 학생의 나이 : "+max);
		
		int min = ages[0];
		for(int i = 0; i < ages.length; i++) {
			if(ages[i] < min) {
				min = ages[i];
			}
		}
		System.out.println("가장 어린 학생의 나이 : "+min);
		
		
		

		
		

	}

}
