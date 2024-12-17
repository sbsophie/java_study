package com.gn.homework09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
//		- 카페 오핀일은 2025년 1월 24일입니다.
//		- 오픈 준비를 위해 아래 일정을 확인해주세요.
//		    1. 오늘 날짜 기준으로 카페 오픈일까지 남은 날짜 수
//		    2. 카페 오픈일이 속한 달의 마지막 날
//		    3. 카페 오픈일의 요일
//		
//		    오늘 날짜 : OOOO년 OO월 OO일
//		    카페 오픈일까지 남은 날 : OO일
//		    오픈달의 마지막 날 : 31일
//		    카페 오픈일의 요일 : 금요일
		
		Date d = new Date();
		Calendar cal1 = Calendar.getInstance();
		System.out.print("오늘 날짜 :");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf1.format(d));
		
		Calendar cal2 = Calendar.getInstance();
//		cal2.add(Calendar.DAY_OF_WEEK, 7);
		cal2.add(Calendar.MONTH, 0);
		cal2.add(Calendar.YEAR, 1);
		long diff = cal2.getTimeInMillis()-cal1.getTimeInMillis();
		long day = diff/(24*60*60*1000);
		System.out.println("카페 오픈일까지 남은 날 : "+day+"일");
		
		int last = cal2.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("오픈달의 마지막 날 : "+last+"일");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("E요일");
		System.out.println(sdf2.format(day));

		
		
		
		
		
		
		
		
		
		
		
	}
}
