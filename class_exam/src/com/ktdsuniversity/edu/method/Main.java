package com.ktdsuniversity.edu.method;

public class Main {
	
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.sum(0);
		calc.sum(0L);
		calc.sum(0, 0);
		calc.sum(0, 0, 0);
		
		Welcome welcome = new Welcome();
		String greeting = welcome.greeting();
		System.out.println(greeting);
		
		greeting = welcome.greeting("DH");
		System.out.println(greeting);

		greeting = welcome.greeting("DH", "안녕?");
		System.out.println(greeting);
		
		greeting = welcome.greeting("DH", "조태용");
		System.out.println(greeting);
		
		greeting = welcome.greeting("DH", "조태용", "LDH");
		System.out.println(greeting);
		
		// 배열 파라미터 Case 1
		greeting = welcome.greetings(new String[] {"DH", "조태용", "LDH"});
		System.out.println(greeting);
		

	}
}
