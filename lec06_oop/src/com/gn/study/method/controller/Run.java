package com.gn.study.method.controller;

import com.gn.study.method.model.vo.Hospital;
import com.gn.study.method.model.vo.Library;
import com.gn.study.method.model.vo.Smartphone;

public class Run {
	public static void main(String[] args) {
	
// Smart phone		
		// 객체 생성 (=인스턴스화 라고도 부름)
		Smartphone myPhone = new Smartphone();
		
		System.out.println("=========================");
		myPhone.checkWork();
		System.out.println("=========================");
		
		// 1. 반환형x,매개변수x
		myPhone.openApp();
		
		// 2. 반환형o,매개변수x
		int battery = myPhone.checkBattery();
		System.out.println("잔량 배터리 :"+battery); 
		System.out.println(myPhone.checkBattery()); //이렇게 출력할 수 도 있음
		
		// 3. 반환형x,매개변수o
		myPhone.setVolume(15); //메소드의 매개변수에 넣은 값을 넣어야함
		
		// 4. 반환형o,매개변수o
		String result = myPhone.sendMsg("자니?");
		System.out.println(result);
		
		
// Library		
		// 객체화
		Library library = new Library();
		
		library.borrowBooks("해리포터","반지의 제왕","데미안");
		
		library.returnBooks(1000, "1984","파친코");
		
// Hospital
		// 객체화
		Hospital hospital = new Hospital();
		
		hospital.emergencyCall();
//		hospital.doctorCall();
//		hospital.staffAnnouncement();
//		hospital.personalRecord();
		
		// 인스턴스를 생성하지 않고 메소드 호출 가능
		Hospital.hospitalInfo();  //클래스명.메소드명();  앞에 대문자
		
		
		
		
	}
}
