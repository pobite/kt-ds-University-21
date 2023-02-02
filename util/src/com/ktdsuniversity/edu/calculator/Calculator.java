package com.ktdsuniversity.edu.calculator;

import java.util.Scanner;

import com.ktdsuniversity.edu.util.NumberUtil;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		// byte로 변경
		byte b = NumberUtil.toByte(string, (byte)99);
		System.out.println(b);
	}	
}
