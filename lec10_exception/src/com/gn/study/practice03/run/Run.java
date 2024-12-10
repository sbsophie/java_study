package com.gn.study.practice03.run;

import java.util.Scanner;

import com.gn.study.practice03.controller.LoginManager;
import com.gn.study.practice03.exception.InvalidCredentialsException;

public class Run {
	public static void main(String[] args) {
		LoginManager lm = new LoginManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String name1 = sc.next();
		System.out.println("비밀번호 : ");
		String name2 = sc.next();
		
		
		try {
			lm.login(name1, name2);
		}catch(InvalidCredentialsException e) {
			e.printStackTrace();
		}		
		
		
		
	}
}
