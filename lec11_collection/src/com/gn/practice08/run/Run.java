package com.gn.practice08.run;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.gn.practice08.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Set<Person> per1 = new HashSet<Person>();
		per1.add(new Person("홍길동",20));
		per1.add(new Person("이순신",25));
		per1.add(new Person("유관순",22));
				
		Set<Person> per2 = new HashSet<Person>();
		per2.add(new Person("유관순",22));
		per2.add(new Person("강감찬",27));
		per2.add(new Person("을지문덕",30));
		
		System.out.println("=== 합집합 ===");
		//합집합
		Set<Person> union = new TreeSet<Person>();
		union.addAll(per1);
		union.addAll(per2);
		Iterator<Person> iterator1 = union.iterator();
		int i = 1;
		while(iterator1.hasNext()) {
			Person p = iterator1.next();
			System.out.println(i+"번 "+p);
			i++;
		}	
		
		System.out.println("=== 교집합 ===");
		//교집합
		Set<Person> intersection = new HashSet<Person>(per1);
		intersection.retainAll(per2);
		Iterator<Person> iterator2 = intersection.iterator();
		i = 1;
		while(iterator2.hasNext()) {
			Person p2 = iterator2.next();
			System.out.println(i+"번 :"+p2);
			i++;
		}
		
		System.out.println("=== 차집합 ===");
		//차집합
		Set<Person> difference = new HashSet<Person>(per1);
		difference.removeAll(per2);
		Iterator<Person> iterator3 = difference.iterator();
		i = 1;
		while(iterator3.hasNext()) {
			Person p3 = iterator3.next();
			System.out.println(i+"번 "+p3);
			i++;
		}
		
		
		
		
		
	}
}
