package com.gn.practice09;

import java.util.Calendar;

public class Run {
	public static void main(String[] args) {
//		연초(1월 1일)부터 오늘까지 며칠이 지났는지 계산하세요.
//		아래 힌트를 참고하여 문제를 해결하세요.
//		2) 힌트
//		연초 날짜는 Calendar 객체를 사용해 2024년 1월 1일로 설정하세요.
//		오늘 날짜는 Calendar.getInstance()로 생성하세요.
//		두 날짜의 밀리초 차이를 계산하려면 getTimeInMillis() 메소드를 사용하세요.
//		일수로 변환하려면 아래 수식을 사용하세요.
//		diff = diff/1000;
//		long days = diff / (24 * 60 * 60 * 1000);
		
		String startDay = "2024-1-1";
		String[] temp = startDay.split("-");
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(temp[0]),Integer.parseInt(temp[1])-1,Integer.parseInt(temp[2]));
		cal.add(Calendar.MONTH, -1);
		Calendar today = Calendar.getInstance();
//		System.out.println(today);
		
		long diff = today.getTimeInMillis()-cal.getTimeInMillis();
//		diff = diff/1000;
//		diff = diff/(24*60*60);
		long days = diff/(24*60*60*1000);
		System.out.println(days);
		
		
		
		
		
		
	}
}
