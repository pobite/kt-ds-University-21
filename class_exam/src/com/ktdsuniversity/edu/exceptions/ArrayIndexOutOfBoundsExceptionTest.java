package com.ktdsuniversity.edu.exceptions;

public class ArrayIndexOutOfBoundsExceptionTest {
	
	// RuntimeException
	// try catch 걸어도 할 게 없고, 안 걸어도 할 게 없음.
	
	
	public static void main(String[] args) {
		String[] nameArr = new String[3];
		nameArr[0] = "조태용";
		nameArr[1] = "정덕수";
		nameArr[2] = "이유나";
		
		String name = nameArr[0];
		System.out.println(name);
		
		name = nameArr[1];
		System.out.println(name);
		
		name = nameArr[2];
		System.out.println(name);
		
		if (nameArr.length > 3) {
			name = nameArr[3];	// 에러 발생
			System.out.println(name);
		}
		
		String string = " 안녕하세요~ 오늘은 동물 이름 영어로 말하기 포스팅이에요 :) · 기린 영어로 우선 기린입니다! · ' 쥐랲 ' 정도의 발음으로 읽으시면 되겠네요 :) ";
		String[] wordArray = string.split(" ");
		// 길이를 찍어보지 않는 이상 몇 개인지 모름.
		
		if (wordArray.length > 50) {
			String word = wordArray[50];
			System.out.println(word);
		}
		
		try {
			String word = wordArray[50];
			System.out.println(word);
		}
		// 발생하는 예외 적기
		catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("그런 인덱스는 없습니다.");
		}
		
		
		
		
		
		
	}
}