package com.ktdsuniversity.edu.exceptions;

public class NumberFormatExceptionTest {
	
	// 숫자인지 아닌지 판단.
	// NumberUtil 안에다 만들어서 씀.
	public static boolean isInteger (String string) {
		if (string == null) {
			return false;
		}
		
		// 이 문자가 숫자인지 아닌지 알 수 있음.
		/**
		 * 정규 표현식
		 * 앞에 ^ - 무언가로 시작한다
		 * 끝에 $ - 무언가로 끝난다
		 * [0-9] - 숫자로 시작하고
		 * + - 1글자 이상이다.
		 * 
		 * 중간에 다른 문자 있으면 fasle로 나옴.
		 */
		return string.matches("^[0-9]+$");
	}
	
	public static void main(String[] args) {
		
		System.out.println(isInteger("12345"));
		System.out.println(isInteger("123.45"));
		System.out.println(isInteger("123. 45"));
		System.out.println(isInteger("ABC"));
		
		String str = "1234";
		if (isInteger(str)) {
			int num = Integer.parseInt(str);
			System.out.println(num);
		}
		
		try {
			Integer.parseInt("adfa");
		}
		catch (NumberFormatException nfe) {
			System.out.println("변환할 수 없습니다.");
		}
	}
}