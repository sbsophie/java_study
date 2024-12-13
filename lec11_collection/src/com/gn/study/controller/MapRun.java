package com.gn.study.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gn.study.model.vo.Snack;

public class MapRun {
	public static void main(String[] args) {
		
// 1. HashMap 생성
	Map<String,Object> flower = new HashMap<String,Object>();
// 2. HashMap 요소 추가
	flower.put("name","샌더소니아");
	flower.put("lang","성공");
	flower.put("price",40000);
	// 중복된 key 사용
	flower.put("price",50000);
	System.out.println(flower);
	//출력값 : {price=50000, name=샌더소니아, lang=성공}
	
// 4. HashMap 요소 조회(1)
	String f_name =  (String)(flower.get("name"));  //문자열이 아닌 애(몸집이 큰 Object)를 문자열로 사용하려고 하려면 String으로 낮춰줘야함
	System.out.println(f_name);
	
	System.out.println(flower.get("lang"));
	
//// 6. HashMap 요소 조회(2)
//	// (1) HashMap 요소들의 key값으로 Set 만들기
//	Set<String> keySet = flower.keySet();
//	// (2) Iterator 만들기
//	Iterator<String> itkey = keySet.iterator();
//	// (3) HasNext()  손을 집어넣어서 조회
//	while(itkey.hasNext()) {
//		String key = itkey.next();
////		System.out.println(key);
////		flower.get(key); //이렇게 출력가능
//		Object value = flower.get(key);
//		System.out.println(key+":"+value);
//	}
//	
//	// (1) HashMap 요소들의 key+value 값으로 entrySet 만들기
//	Set<Entry<String,Object>> entrySet = flower.entrySet();
//	// (2) Iterator 만들기
//	Iterator<Entry<String,Object>> itEntry = entrySet.iterator();
//	// (3) HasNext()  손을 집어넣어서 조회
//	while(itEntry.hasNext()) {
//		Entry<String,Object> entry = itEntry.next();
//		String key = entry.getKey();
//		Object value = entry.getValue();
//		System.out.println(key+"="+value);
//	}
	
	
// 3. HashMap<key,객체> 요서 추가
	Map<String,Snack> snackMap = new HashMap<String,Snack>();
	snackMap.put("다이제", new Snack("초코맛",1700));
	snackMap.put("새우깡", new Snack("매운맛",900));
	snackMap.put("포테이토칩", new Snack("양파맛",500));
	System.out.println(snackMap);
	//출력값 : {다이제=[맛=초코맛, 칼로리=1700], 새우깡=[맛=매운맛, 칼로리=900], 포테이토칩=[맛=양파맛, 칼로리=500]}
	
// 5. HashMap<key,객체> 요소 조회(1)
	// 아래는 Snack s1 = new Snack("초코맛",1700);라고 쓴거랑 같음
	Snack s1 = snackMap.get("다이제");
	System.out.println(s1);
	s1.setFlavor("기본맛");
	System.out.println(snackMap);
	// 포테이토칩 양파맛 -> 소금맛으로 바꾸는 방법
	snackMap.get("포테이토칩").setFlavor("소금맛");
	System.out.println(snackMap);
	//출력값 : {다이제=[맛=기본맛, 칼로리=1700], 새우깡=[맛=매운맛, 칼로리=900], 포테이토칩=[맛=소금맛, 칼로리=500]}
	
// 7. HashMap<객체> 요소 조회(2)
	// (1) keySet() 사용하여 조회
	// Map<String,Snack> snackMap = new HashMap<String,Snack>();
	// Map이 set으로 탈바꿈해야 Iterator사용 가능하다
	Set<String> keySet = snackMap.keySet();
	Iterator<String> itKey = keySet.iterator();
	while(itKey.hasNext()) {
		String key = itKey.next();
		Snack value = snackMap.get(key);
		System.out.println(key+"::"+value);
	}
	// (2) entrySet() 사용하여 조회
	Set<Entry<String,Snack>> entrySet = snackMap.entrySet();
	Iterator<Entry<String,Snack>> itEntry = entrySet.iterator();
	while(itEntry.hasNext()) {
		Entry<String,Snack> entry = itEntry.next();
		String key = entry.getKey();
		Snack value = entry.getValue();
		System.out.println(key+"=="+value);
	}
	
// 8. HashMap 요소 삭제
//	System.out.println(flower.size()+" : "+flower);
//	// 위 flower를 보기 위해 작성함  / 출력값  ->3 : {price=50000, name=샌더소니아, lang=성공}
//	flower.remove("price"); //괄호안에 key값 넣어주기
//	System.out.println(flower.size()+" : "+flower);
//	flower.clear();
//	System.out.println(flower.size()+" : "+flower);
	
// 9. HashMap 요소 검색	
	//containsKey()  키값을 기준으로!
	if(flower.containsKey("price")) {
		System.out.println("o");
	}else {
		System.out.println("x");
	}
	//containsValue()  
	if(flower.containsValue(40000)) {
		System.out.println("싸다!!");
	}else {
		System.out.println("비싸다!!");
	}
	
// 10. HashMap<객체> 요소 검색	 >> hashCode,equals 만들어줘야 작동함
	if(snackMap.containsValue(new Snack("매운맛",900))) {
		System.out.println("다 내꺼");
	}
	
// 11. LinkedHashMap
	Map<String,Object> flower2 = new LinkedHashMap<String,Object>();
	//Map<String,Object> flower2 = new TreeMap<String,Object>();
	// 내림차순으로 바꾸고 싶으면 위 괄호안에 Collections.reverseOrder()를 넣어주기
	// TreeMap은  키값을 기준으로 오름차순으로 자동정렬해준다
	flower2.put("price", 20000);
	flower2.put("lang", "고백");
	flower2.put("name", "튤립");
	System.out.println(flower2);  // 출력값 : {price=20000, lang=고백, name=튤립}

	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
