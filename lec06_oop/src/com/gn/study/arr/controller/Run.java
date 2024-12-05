package com.gn.study.arr.controller;

import com.gn.study.arr.model.vo.Academy;

public class Run {
	public static void main(String[] args) {
		// 1. 객체 배열 선언
		Academy[] arr1;
		
		
		// 2. 객체배열의 생성
		// (1). 선언 후 생성
		arr1 = new Academy[2];
		// (2). 선언과 동시에 생성
		Academy[] arr2 = new Academy[4];
		
		
		// 3. 객체 배열의 초기화 (객체 배열의 초기화 할떄에는 for문을 잘 사용하지 않는다)
		// (1) 인덱스
		Academy a1 = new Academy("가남학원","0101111111");
		arr1[0] = a1;
		arr1[1] = new Academy("나남학원","0102222222");
		// (2) 선언과 동시에 초기화
		int[] intArr2 = {1,2,3,4};
		Academy[] arr3 = {new Academy("다담","0103333333"), new Academy("라람","0104444444")};
		
		
		// 4. 출력
		System.out.println(arr1);  // 이건 배열임
		System.out.println(arr1[1]);  //이건 객체임
		System.out.println(arr1[1].getName());
		
		// for문으로 출력
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i].getName());
		}
		// 포이치문으로 출력
		for(Academy ac : arr3) {
			System.out.println(ac.getName());
		}
		
	}

	
	
	
	
	
	
	
	
	
	
}
