package com.gn.practice10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
		// 오늘 날짜를 기준으로 1주일 뒤에 날짜 정보를 출력
		// 00월 00일 0요일
		Date d = new Date();
		
		Calendar cal1 = Calendar.getInstance();
		cal1.add(Calendar.DAY_OF_WEEK, 7);
		
		Date date = cal1.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf.format(date));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
