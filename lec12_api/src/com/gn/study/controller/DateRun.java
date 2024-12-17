package com.gn.study.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
		
		// 날짜 변경(1) : set
		Calendar christmas = Calendar.getInstance();
		christmas.set(Calendar.DATE,25);
		christmas.set(2024, 12-1, 25);  // 꺼낼때set는 -1 / 넣을때get는 +1
		System.out.println(christmas);
		
		// 날짜 변경(2) : add
		Calendar cal3 = Calendar.getInstance();
		cal3.add(Calendar.DATE, 7);  // 7이면 다음주 -7이면 저번주
		
		// 문자열 형태 날짜 정보로 변환
		String toDay = "2024-5-14";
		String[] temp = toDay.split("-");
		
		Calendar cal4 = Calendar.getInstance();
		cal4.set(Integer.parseInt(temp[0]),
				Integer.parseInt(temp[1])-1,
				Integer.parseInt(temp[2]));
		
		cal4.add(Calendar.MONTH, -1); // 5/14일 한달전
		System.out.println(cal4);
		
		// 두 날짜 사이의 차이 구하기
		Calendar cal5 = Calendar.getInstance();
		cal5.set(2024, 10-1,16);
		Calendar today = Calendar.getInstance(); //오늘 날짜를 담고 있는애 만들어줌
		long diff = today.getTimeInMillis()-cal5.getTimeInMillis();
		diff = diff/1000;   // 1초 == 1000ms(밀리세컨즈)
		diff = diff/(24*60*60);  //24시간*60분*60초
		System.out.println(diff);
		
		// 최대값 구하기
		Calendar cal6 = Calendar.getInstance();
		int last = cal6.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("마지막 날짜 : "+ last);
				
		// date 써보기
		Date d = new Date();  //객체화
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E HH:mm:ss");
//		System.out.println(sdf.format(d));
		String printDate = sdf.format(d);
		System.out.println(printDate);
		
		// 7. 
		Calendar cal7 = Calendar.getInstance();
//		cal7.add(Calendar.YEAR, 1); 내년
		Date date = cal7.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd a KK:mm"); // a는 오후를 뜻함
		sdf2 = new SimpleDateFormat("yyyy-MM-dd a KK:mm:ss");
		System.out.println(sdf2.format(date));
		
		
		
		
		
		
	}
}
