package com.gn.study.controller;

public class StringRun {
	public static void main(String[] args) {
		// 1. 리터럴형태로 초기화하세요(쌍따움표로 만든게 리터럴방법) -> ""
		// 값이 같으면 hashCode 동일, == 비교 연산자 사용가능
		String str = "Hello";
		System.out.println("Hello(1) : "+System.identityHashCode(str));
//		str += "world";
		System.out.println(System.identityHashCode(str));
		
		String str1 = "Hello";
		System.out.println("Hello(2) : "+System.identityHashCode(str1));
		if(str == str1) {
			System.out.println("같다");
		}
		
		// 2. new 연산자 -> 객체
		String str2 = new String("Hello");
		System.out.println(System.identityHashCode(str2));
		
		// 3. equals  값을 비교해주는아이
		System.out.println("equals() : "+("Hi".equals(str2)));
		// 4. length()  현재 문자열의 글자수 반환
		System.out.println("length() : "+str2.length());
		// 5. charAt(index)  지정된 위치에 있는 문자(char) 반환
		System.out.println("charAt(i) : "+str2.charAt(0));
		// 6. toCharArray()  현재 문자열의 문자를 char[]배열로 변환
		char[] arr = str2.toCharArray();
		System.out.println((int)'a'+"~"+(int)'z');
		// 7. contains() 특정 문자열이 기준 문자열에 포함되어 있는지 확인
		System.out.println("contains() : "+str2.contains("lo"));
		// 8. compareTo() 두개의 문자열을 비교할때 사용/두개의 문자열이 같으면 0반환
		//				기준이 되는 문자열이 사전상 앞이면 음수,뒤면 양수
		System.out.println("compareTo() : "+str2.compareTo("ZZZ"));
		// 9. concat  문자열을 연결하는 방법 / 원본값 수정 불가능
		String test = "우리는";
		test = test.concat("할수있다.");  // 앞에 'test =' 이라고 재할당을 해줘야연결됨
		System.out.println(test);
		
		// 10. indexOf
		test = "2024.12.16.12.43";
		System.out.println(test.indexOf("."));
		System.out.println(test.indexOf("12"));
		System.out.println(test.lastIndexOf("12"));
		
		// 11. split
		String a = "a+b+c+d";
		String[] arrA = a.split("\\+");
		String b = "e.f.g.h";
		String[] arrB = b.split("\\.");
		
		String name ="김 철 수";
		String[] nameArr = name.split(" ");
		for(String n : nameArr) {
			System.out.println(n);
		}
		
		// 문자열 바꾸기
		String ide = "eclipse";
		ide = ide.replace("e", "a");  //replace는 제할당해줘야하는 아이임
		System.out.println(ide);
		
		String id = "김 철 수";
		id = id.replace(" ", "");
		System.out.println(id);
		
		// 비어있는지 확인
		String empty1 = "";
		String empty2 = " ";
		System.out.println("(1) : "+empty1.isBlank());
		System.out.println("(2) : "+empty2.isBlank());
		
		System.out.println("(3) : "+empty1.isEmpty()); 
		System.out.println("(4) : "+empty2.isEmpty()); //띄어쓰기도 문자열로 판단한다
		
		System.out.println(empty1.length() == 0);
		empty2 = empty2.replace(" ", "");
		System.out.println(empty2.length() == 0);
		
		// trim 사용하여 비어있는지 확인
		String empty3 = " 안 녕 ";
		empty3 = empty3.trim();
		System.out.println(empty3);
		
		// join 사용하여 붙이기
		String[] students = {"철수","영희","길동"};
		String allStudent = String.join("-",students);
		System.out.println(allStudent);
		
		// substring 사용해서 자르기(컷)
		String cutTest = "hello world";
		System.out.println(cutTest.substring(6));
		System.out.println(cutTest.substring(0,5));
		System.out.println(cutTest.substring(3,4));
		
		String file = "test.jpg";
		String ex = file.substring(file.lastIndexOf(".")+1);
		String file_name = file.substring(0,file.lastIndexOf("."));
		System.out.println(ex+" : "+file_name);
		
		// valueOf   숫자를 문자열로 변경하는 방법
		double pi = 3.14;
		String piStr = String.valueOf(pi);
		System.out.println(piStr);
		
		// StringBuiler  문자열 추가
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("World!!");
		System.out.println(sb);
		
		// insert  문자열 삽입
		sb.insert(5, " Java ");
		System.out.println(sb);
		
		// delete 문자열 삭제(1)
		sb.delete(11, 16+1);
		System.out.println(sb);
		
		// deleteCharAt 문자열 삭제(2)
		int idx = sb.indexOf("!");
		sb.deleteCharAt(idx);
		System.out.println(sb);
		
		// reverse 문자열 뒤집기
		sb.reverse();
		System.out.println(sb);
		
		
		
		
		
		
		
		
	}
}
