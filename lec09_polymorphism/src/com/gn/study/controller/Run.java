package com.gn.study.controller;

import com.gn.study.model.vo.Beverage;
import com.gn.study.model.vo.Coffee;
import com.gn.study.model.vo.OrangeJuice;

public class Run {

	public static void main(String[] args) {
// 1. 클래스의 업캐스팅
		int i_num = 3;
		double d_num = i_num;
		System.out.println(d_num);
		
		//(왼쪽이 껍데기이고 오른쪽이 알맹이임)
		Beverage b1 = new Coffee();
		Beverage b2 = new OrangeJuice();

		//메소드 호출
		b1.drink();
// 클래스의 다운캐스팅 예시
//		b1.ice();  부모클래스인 beverage가 자식클래스인 ice에 접근 불가능하여 아래와 같이 써줘야 한다.
//		((Coffee)b1).ice();
		((OrangeJuice)b2).fresh();
		b2.drink();
		
// 2. 객체 배열과 다형성
		Beverage[] arr = new Beverage[3];
		
		Beverage bev = new Beverage();
		arr[0] = bev;
		
		Coffee cof = new Coffee();
		arr[1] = cof;
		
		OrangeJuice oj = new OrangeJuice();
		arr[2] = oj;
		
		for(Beverage b : arr) {
			b.drink();
			// 만약에 진짜 데이터가 Coffee면 ice()메소드를 호출
			if(b instanceof Coffee) {
				((Coffee)b).ice();
			}
			// 만약에 진짜 데이터가 OrangeJuice면 fresh()메소드를 호출
			if(b instanceof OrangeJuice) {
				((OrangeJuice)b).fresh();
			}
		}
		
// 3. 클래스 다운캐스팅
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
