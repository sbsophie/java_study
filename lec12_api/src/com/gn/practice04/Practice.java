package com.gn.practice04;

public class Practice {
//	기능제공용 클래스 Practice와 실행용 클래스 Run을 만드세요.
//	Run에서 아래 코드를 실행했을 때, 출력 예시와 같은 결과가 도출될 수 있도록 Practice 클래스에 메소드를 추가하세요.
	
	public String deleteBlank(String str) {
		str = str.trim();
		str = str.replace(" ", "");
		return str;
	
	}
}
