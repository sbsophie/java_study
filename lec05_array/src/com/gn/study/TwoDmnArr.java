package com.gn.study;

public class TwoDmnArr {

	public static void main(String[] args) {
// 1. 2차원 배열의 선언
		int[][] arr;
		String[][] strArr;
		
// 2. 2차원 배열의 생성
		arr = new int[2][3];   //2층,3칸의 의미
		double[][] dot = new double[4][4];
		
// 3. 2차원 배열 초기화
		// (1)(2)(3)
		// (4)(5)(6)
		//(1)인덱스를 이용한 초기화 방법
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][2] = 6;
		
		// (2) 반복문을 이용한 초기화
		int cnt = 1;
		
		for(int i = 0; i < arr.length; i++) {  //length사용하면 층,열을 한번에 표현
			for(int j = 0; j < arr[i].length; j++) { // [].length
				//System.out.println(i+" : "+j);
				arr[i][j] = cnt++;
			}
		}
		
		// (3) 선언과 동시에 초기화
		int[][] arr5 = {{1,2,3},
						{4,5,6}};
		int[][] arr6 = new int[][] {{1,2,3},
									{4,5,6}};
									
		// (4) 2차원 배열 출력
		// (딸기)(사과)
		// (키위)(당근)
		String[][] strArray = new String[2][2];
		strArray[0][0] = "딸기";
		strArray[0][1] = "사과";
		strArray[1][0] = "키위";
		strArray[1][1] = "당근";

		// (1) 인덱스를 이용한 출력
		System.out.println(strArray[0][1]);
		
		// (2) 반복문을 이용한 출력   : 전체 다 출력하고 싶을때
		for(int i = 0; i < strArray.length; i++) {
			for(int j = 0; j < strArray[i].length; j++)
				System.out.println(strArray[i][j]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
