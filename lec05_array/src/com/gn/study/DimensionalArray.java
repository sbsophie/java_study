package com.gn.study;

public class DimensionalArray {

	public static void main(String[] args) {
		int score1 = 85;
		int score2 = 90;
		int score3 = 78;
		int score4 = 92;
		int score5 = 88;
		
		int[] scores = {85,90,78,92,88};
		
// 1. 배열의 선언   
		int[] intArr;
		String[] strArr;
		
// 2. 배열의 생성	   배열선언 후 생성(배열안에 들어갈 데이터의 개수를 지정)
		int[] nums;
		nums = new int[4];
		
		int[] heights = new int[10];
		
// 3. 배열의 길이(인덱스)   
		//인덱스는 1부터가 아닌 0부터 시작하므로,
		//배열 마지막요소에 항상 배열의 길이 -1을 해줘야함
		// 문자열변수 형태 : .length()
		// 배열명변수 형태 : .length
		System.out.println(heights.length);
		
// 4. 배열의 초기화(default)
		System.out.println(heights[2]);
		
// 5. 배열의 초기화(값 변경할때 사용하는 방법)
		// (1) 인덱스를 활용한 방법
		int[] age1 = new int[3];
		age1[0] = 40;
		age1[1] = 20;
		age1[2] = 70;
		
		// (2) for문을 활용한 방법 (규칙이 있을때 for문을 사용함)
		int[] age2 = new int[3];
		for(int i = 0; i < age2.length; i++) {
			age2[i] = i+10;
		}
		
		// (3) 선언과 동시에 초기화
		// 선언 -> 생성(생략) -> 초기화
		int[] age3 = new int[] {1,2,3,4};
		int[] age4 = {5,6,7};
		// 아래 방법 불가능!!
//		int[] element;
//		element = {9,10,11};
		
// 6. 배열의 저장과정
		int[] score;  //(1)선언 : Stack에 score라는 이름의 저장공간이 마련됨
		score = new int[4];	//(2)생성 : Heap에 기차가 생김, Stack에 기차의 주소값 저장
		score[0] = 90;	//(3)초기화 : Heap의 값 변경
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
