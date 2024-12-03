package com.gn.practice;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
//		철수는 여자친구 영희에게 생일 축하 메시지를 보내려고 해요.
//		그런데 철수의 여자친구 영희는 띄어쓰기를 싫어합니다.
//		철수가 어떤 문자열을 입력하든 영희에게 혼나지 않게
//		글자 사이에 있는 띄어쓰기가 없게 출력해주세요.
//		
//		**영희야 생 일 축 하 해 !**
//		영희야생일축하해!
		
		// 특정 문자가 공백일 때 : 문자 == ' '
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				continue;
			}
			System.out.print(str.charAt(i));
		} 
		
		

		

	}

}
