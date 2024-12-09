package com.gn.practice02.run;

import com.gn.practice02.model.vo.*;

public class Run {
	public static void main(String[] args) {
		SchoolMember[] arr = new SchoolMember[3];
		arr[0] = new Student();
		arr[1] = new Teacher();
		arr[2] = new Staff();
		
		for(SchoolMember m :arr) {
			m.introduce();
			if(m instanceof Student) {
				((Student)m).study();
			}
			if(m instanceof Teacher) {
				((Teacher)m).teach();
			}
			if(m instanceof Staff) {
				((Staff)m).work();
			}
		}
		
		
		
	}

}
