package com.gn.practice08.model.vo;

import java.util.Objects;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}
	
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Person) {
			Person p = (Person)obj;
			if(p.name.equals(name)&&p.age == age) {
				result = true;
			}
		}
		return result;
	}
	@Override
	public String toString() {
		return name+"("+age+")";
	}
	
	public int compareTo(Person other) {
		return this.name.compareTo(other.name);
	}
	
	
	
	
	
}
