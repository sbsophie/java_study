package com.gn.practice;

public class Practice06 {

	public static void main(String[] args) {
//		2행, 3열짜리 문자열형 2차원 배열 arr를 선언, 생성하세요.
//		선언 및 생성된 2차원 배열에 모든 인덱스에 접근하여 해당 인덱스의 값을 다음와 같은 형식 (0,0)으로 저장하세요.
//		그 후, 저장한 값을 모두 출력하세요.
//
//		(0,0)(0,1)(0,2)
//		(1,0)(1,1)(1,2)
		
		String[][] strArray = new String[2][3];
		
		strArray[0][0] = "(0,0)";
		strArray[0][1] = "(0,1)";
		strArray[0][2] = "(0,2)";
		strArray[1][0] = "(1,0)";
		strArray[1][1] = "(1,1)";
		strArray[1][2] = "(1,2)";
		
		for(int i = 0; i < strArray.length; i++) {
			for(int j = 0; j <strArray[i].length; j++) {
//				arr[i][j] = "("+i+","+j+")";  //이렇게 쓰면 위에 strArray를 일일이 다 작성 안해도 됨
				System.out.print(strArray[i][j]);
			}
			if(i != strArray.length-1) {   // 띄어쓰기를 여기 한번에만 적용하고 싶을때 (-1은 너가 마지막이냐고 물어보는 의미임)
				System.out.println(); // for문을 한번 돌고 나온 다음에 넣어야 띄어쓰기 가능				
			}
		}
		
		
		
		
		
	}

}
