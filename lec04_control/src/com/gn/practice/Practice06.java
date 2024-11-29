package com.gn.practice;

public class Practice06 {

	public static void main(String[] args) {
//		1부터 시작하여 1씩 증가하는 숫자들을 출력하다가,
//		합이 100을 초과하는 순간에 그 합을 출력하고
//		프로그램을 종료하는 코드를 작성하세요.
//		
//		for문을 사용하여 1부터 시작하여 숫자를 계속 증가시키면서 합을 누적해요.
//		합이 100을 초과하는 순간에 break문을 통해서 반복문을 종료하고 나옵니다.
//		
//		1
//		3
//		6
//		:
//		초과된 합 : 105
		
		int sum = 0;

		for(int i = 1; ; i++) {
			sum += i;  // 옆산식이랑 같음 sum = sum + i;
			System.out.println(sum);
			if(sum > 100) {
				System.out.println("초과된 합 : "+sum);
				break;
			}
		}
		
		
		
		
		

	}

}
