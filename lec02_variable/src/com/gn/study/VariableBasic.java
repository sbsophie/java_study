package com.gn.study;

public class VariableBasic {
	// ctrl + space -> "main" enter
	public static void main(String[] args) {
		// 1. 변수 선언
		int number;
		
		// 2. 변수 초기화
		int age;
		age = 100;
		int age2 = 100;
		
		// 3. 변수 표준출력
		System.out.println(age);
		
		// 4. 변수의 재할당
		int score = 90;
		System.out.println("1 : "+score);
		score = 95;
		System.out.println("2 : "+score);
		
		// 5. 문자열 변수의 초기화
		String str1 = new String("감사");
		String str2 = "합니다.";
		
		// 6. 기본형과 문자열 비교
		int num1 = 2;
		int num2 = 2;
		System.out.println(num1 == num2); //주소값이 다름
		
		String text1 = new String("apple");
		String text2 = new String("apple");
		System.out.println(text1 == text2);
		System.out.println( text1.equals(text2) ); //heap에 각각따로 저장되어 있음
		// 자바에서 문자를 비교할때는 equals를 사용해야함
		
		// 7. charAt(n)  'n'에는 숫자가 들어가야함
		String word = "Hello";
		char first = word.charAt(0);
		System.out.println(first);
		
		// 8. 업캐스팅 - (1)할당
		// 값의 범위가 작은 데이터는 본인보다 큰 변수에 할당될때 업캐스팅이 발생한다.
		int a = 23;
		double b = a;
		System.out.println(b);
		// (2) 연산
		int c = 3;
		double d =20.5;
		System.out.println(c+d);
		
		// 9. 다운캐스팅
		double d_num = 13.4;
		int i_num = 4;
		System.out.println(d_num+i_num);
		System.out.println((int)d_num+i_num); //정수로 만들고 싶을때
		
		// 10. char형변환
		// (1) 할당
		char test = 'a';  // 자바의 유니코드값 'a'는 97이여서 아래 도출값이 97이 되는거임
		int su = test;
		System.out.println(su);
		//(2) 연산
		int e = 50;
		char f = '2';  // 자바의 유니코드값은 '2'는 50이여서 아래 도출값이 100이 되는거임
		System.out.println(e+f);
		System.out.println(f-'0'); // 문자 형태로 작성된 숫자를 온전한 숫자값으로 도출하는 방법
		
		// 대문자 소문자
		System.out.println((char)((int)'a'-32));
		System.out.println((int)'A');
		
		// 11. 상수 (대문자 및 스네이크케이스 사용)
		final double PI = 3.14;
		final int MAX_SIZE = 100;
		
		
		
	}
}
