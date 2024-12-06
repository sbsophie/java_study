package com.gn.practice03.run;

import com.gn.practice03.model.vo.Circle;
import com.gn.practice03.model.vo.Rectangle;

public class Run {
	public static void main(String[] args) {
//		1. 크기가 2인 Circle, Rectalge 각각의 객체 배열 생성 및 선언
//		2. 사용 데이터를 참고하여 객체 초기화
//		3. 반복문을 통해 각 도형의 draw 메소드 실행
		
		Circle[] arr1 = new Circle[2];
		arr1[0] = new Circle(1,2,3);
		arr1[1] = new Circle(3,3,4);
		
		Rectangle[] arr2 = new Rectangle[2];
		arr2[0] = new Rectangle(-1,-2,5,2);
		arr2[1] = new Rectangle(-2,5,2,8);
		
		// for each문 for(자료형 변수명:출력할변수){변수명.}
		System.out.println("=== circle ===");
		for(Circle c :arr1) {
			c.draw();
		}
		System.out.println("=== rectangle ===");
		for(Rectangle r : arr2) {
			r.draw();
		}
		
		
		
		
//		Point p = new Point();
//		p.draw();
		
		
		
		
		
	}
}
