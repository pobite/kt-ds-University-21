package com.ktdsuniversity.edu.exceptions;

public class NullPointerExceptionTest {
	
	public static String getName(int nameLength) {
		// 숫자만큼의 길이를 돌려주려 함.
		
		if (nameLength == 2) {
			return "둘리";
		}
		else if (nameLength == 3){
			return "이순재";
		}
		else if (nameLength == 4) {
			return "선우용녀";
		}
		
		// 그 이외는 null이다.
		return null;
	}
	
	
	public static void main(String[] args) {
		
		// NullPointerException 발생
		// java.lang.NullPointerException
		String name = null;
		boolean isAStart = name.startsWith("A");
		System.out.println(isAStart);
	}
}
