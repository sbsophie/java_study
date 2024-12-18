package com.gn.practice01;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy\\MM\\dd");
		now.format(dtf1);
		
		File dir = new File("C:\\test\\sub\\"+now.format(dtf1));
		if(dir.exists() == false) {
			if(dir.mkdirs()) {
				System.out.println("디렉토리 생성 성공");
			} else {
				System.out.println("디렉토리 생성 실패");
			}	
		} else {
			System.out.println("이미 존재하는 디렉토리");
		}
		
		
		
		
	}
}
