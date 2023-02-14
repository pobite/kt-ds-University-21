package com.ktdsuniversity.edu.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexOutOfBoundsExceptionTest {

	public static void main(String[] args) {
		
		String string = " 안녕하세요~ 오늘은 동물 이름 영어로 말하기 포스팅이에요 :) · 기린 영어로 우선 기린입니다! · ' 쥐랲 ' 정도의 발음으로 읽으시면 되겠네요 :) ";
		List<String> wordList = new ArrayList<>();
		wordList.addAll(Arrays.asList(string.split(" ")));
		// split을 배열을 리턴하고
		// Arrays.asList에서 배열을 주면 list로 바뀜
		// addAll 괄호 안에 리스트를 wordList에 다 추가하라는뜻
		
		
		
		// 방법 1
		if (wordList.size() > 50) {
			String word = wordList.get(50);
			System.out.println(word);
		}
		
		// 방법 2
		// 강사님이 이렇게 써본적 없음 -> 리스트와 배열한테는 try catch를 하지 않는다.
		try {
			String word = wordList.get(50);
			System.out.println(word);
		}
		catch(IndexOutOfBoundsException ioobe) {
			System.out.println("그런 인덱스는 없습니다.");
		}
		
		
	}
}