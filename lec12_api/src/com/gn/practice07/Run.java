package com.gn.practice07;

public class Run {
	public static void main(String[] args) {
//		변수를 선언하고, 실수형 숫자 5.13824를 변수에 초기값으로 셋팅합니다.
//		그리고 해당 실수를 소수점 첫째자리까지, 둘째자리까지, 셋째자리까지 반올림하여 출력하세요.
//		제곱값 식(pow)을 활용하세요.
//		소수점 첫째자리까지 반올림 : 5.1
//		소수점 둘째자리까지 반올림 : 5.14
//		소수점 셋째자리까지 반올림 : 5.138
		
		double d_num = 5.13824;
//		double multi = d_num*10
		double multi = d_num*Math.pow(10, 1);
		double half = Math.round(multi);
		double div = half/Math.pow(10, 1);
		System.out.println("소수점 첫째자리까지 반올림 : "+div);
		
		double after = Math.round(d_num*100.0)/100.0;
		System.out.println("소수점 둘째자리까지 반올림 : "+after);
		
		double multi2 = d_num*Math.pow(10, 3);
		double half2 = Math.round(multi2);
		double div2 = half2/Math.pow(10, 3);
		System.out.println("소수점 셋째자리까지 반올림 : "+div2);
		
//		선생님 답안 / 이렇게 한번에 할 수도 있음
//		System.out.println((Math.round(d_num*Math.pow(10, 2))/Math.pow(10, 2)));
		
		
	}
}
