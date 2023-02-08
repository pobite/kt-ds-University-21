package com.ktdsuniversity.edu.practice;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		
		Map<String, Integer> scores = new HashMap<>();
		
		scores.put("Java", 100);
		scores.put("C", 90);
		scores.put("C#", 97);
		scores.put("Python", 93);
		
		System.out.println(scores);
		
		scores.put("Java", 50);
		System.out.println(scores);
		
		System.out.println(scores.size());
		
		
		int javaScore = scores.get("Java");
		System.out.println(javaScore);
		
		System.out.println(scores.get("Sleepy"));
		// Null 반환
		
//		int javaScore2 = scores.get("Sleepy");
//		System.out.println(javaScore2);
		// int에 넣을 때 null을 숫자로 변환하려다가 에러 발생.
		// Null 은 레퍼런스 타입, 내부적으로 변환하려고
		// Null. -> '.' 하는 순간 에러 발생
		// java.lang.NullPointerException
		// 이럴 때 쓰는 게 containsKey()
		
		
		boolean isContains = scores.containsKey("F");	//없음
		System.out.println(isContains);
		
		int fScore = 0;
		if (isContains) {
			fScore = scores.get("F");
		}
		System.out.println(fScore);
		
		scores.remove("C");	// 존재하는 Key
		scores.remove("F");	// 존재하지 않는 Key
		
		// 존재하지 않는 Key 삭제해도 아무일 일어나지 않음.
		
		scores.clear();
		System.out.println(scores);
		
	}
	
}
