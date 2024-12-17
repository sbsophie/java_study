package com.gn.practice06;

public class Practice {
//	Practice 클래스에 메소드를 생성하고, 아래 기능을 수행한 후 String을 반환하세요.
	public String test() {
		StringBuilder sb = new StringBuilder("WELCOME TO JAVA");
		sb.append("!");
		sb.insert(0, "<<");
	  //sb.delete(10, 12+1);
		int idx1 = sb.indexOf(" ");
		int idx2 = sb.lastIndexOf(" ");
		System.out.println(idx1 + " : "+ idx2);
		sb.delete(idx1, idx2);
		
		sb.reverse();
		return sb.toString();
	}
//	아래 작업을 수행하여 안내판의 동작을 구현하세요.
//	1단계 : 문장 끝에 느낌표 !를 추가하세요.
//	2단계 : 문장 앞에 <<를 삽입하세요.
//	3단계 : 가운데 단어를 제거하세요.
//	4단계 : 마지막으로 모든 문자를 뒤집은 결과를 리턴하세요
//	
//	!AVAJ EMOCLEW <<
	
	
	
	
	
	
}
