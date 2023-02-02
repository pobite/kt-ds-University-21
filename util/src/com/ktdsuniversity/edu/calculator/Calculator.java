package com.ktdsuniversity.edu.calculator;

import java.util.Scanner;

import com.ktdsuniversity.edu.exceptions.NotSupportAgeException;
import com.ktdsuniversity.edu.util.NumberUtil;

public class Calculator {
	
	public static void checkAge(int age) {
		if (age > 150) {
			throw new NotSupportAgeException("151세 이상은 입력할 수 없습니다.");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		checkAge(10);
		try {
			checkAge(200);
		}
		catch (NotSupportAgeException nsage) {
			System.out.println(nsage.getMessage());
		}
		
		
		
		
		int age = 200;
		if (age > 150) {
//			throw new NotSupportAgeException();
			throw new NotSupportAgeException("151세 이상은 입력할 수 없습니다.");
		}
		
		
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		// byte로 변경
		byte b = NumberUtil.toByte(string, (byte)99);
		System.out.println(b);
	}	
}
