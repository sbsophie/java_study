package com.gn.study.controller;

import java.util.Calendar;

public class DateRun {
	public static void main(String[] args) {
		// Calendar
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1);
		// 날짜 정보 가져오기
		int year = cal1.get(Calendar.YEAR);
		int mon = cal1.get(Calendar.MONTH)+1; //+1을 안하면 11월로 나옴
		System.out.println(year+"년"+mon+"월");
		
		Calendar cal2 = Calendar.getInstance();
		int year2 = cal2.get(Calendar.YEAR);
		int mon2 = cal2.get(Calendar.MONTH)+1;
		int date2 = cal2.get(Calendar.DATE);
		
		int day2 = cal2.get(Calendar.DAY_OF_WEEK);
		String str2 = "";
		switch(day2) {
			case 1 : str2 = "일";break;
			case 2 : str2 = "월";break;
			case 3 : str2 = "화";break;
		}
		
		System.out.println(year2+"년 "+mon2+"월 "+date2+"일 "+str2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
