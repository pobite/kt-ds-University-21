package com.ktdsuniversity.edu.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IfTest {
	
	public static void main(String[] args) {
		
		int age = 50;
		boolean isAdult = age > 19;
		
		if (isAdult) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("미성년입니다.");
		}
		
		
		int avg = 85;
		String grade = "";
		if (avg >= 90) {
			grade = "A";
		}
		else if (avg >= 80) {
			grade = "B";
		}else {
			grade = "F";
		}
		
		
		
		
	}
}
