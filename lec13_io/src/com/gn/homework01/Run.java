package com.gn.homework01;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Run {
	public static void main(String[] args) {
		LocalTime startTime = LocalTime.now();
		LocalTime endTime = LocalTime.of(0, 0);
//		Calendar time = Calendar.getInstance();
//		long diff = time.getTimeInMillis();
		
		Practice p = new Practice();
		String song = "나비야, 나비야 이리 날아오너라"
				+ "\n노랑나비, 흰 나비 춤을 추며 오너라"
				+"\n봄바람에 꽃잎도 방긋방긋 웃으며"
				+ "\n참새도 짹짹짹 노래하며 춤춘다";
		p.method1(song);
		p.method2(song);
		
		long timeBetween = ChronoUnit.NANOS.between(startTime,endTime);
	}
}
