package com.gn.study.practice01;

public class Run {
	public static void main(String[] args) {
//		크기가 1,000,000인 정수 배열을 생성하세요.
//		그 다음 랜덤값(1~100사이)으로 해당 배열을 초기화하세요.
//		System.arraycopy()를 사용하여 이 배열의 절반을 새로운 배열로 복사하세요.
//		복사된 배열의 값을 출력예시와 같은 모양으로 출력하세요.
//		System.curentTimeMillis()를 사용하여 기능 구현에 소요되는 시간을 측정하여 출력하세요.
//		
//		...// 숫자 10개 단위로 끊어서 배열 출력
//		43,32,40,14,90,63,59,91,66,66
//		22,63,58,35,30,95,46,85,98,19
//		17,71,51,42,18,98,33,7,89,14
//		복사 작업 소요 시간: 35ms
		long before = System.currentTimeMillis();
		
		int[] arr = new int[1000000];
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;   //100범주,1시작
		}
		
		int[] dst = new int[arr.length/2];
		System.arraycopy(arr, 0, dst, 0,dst.length);
		
		long after = System.currentTimeMillis();
		System.out.println("복사 작업 소요 시간: "+(after-before));
		

		
	}
}
