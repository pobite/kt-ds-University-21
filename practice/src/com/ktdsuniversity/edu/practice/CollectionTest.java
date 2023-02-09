package com.ktdsuniversity.edu.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTest {
	
	public static void main(String[] args) {
		
		// 배열
		int[] scoreArr = new int[4];  
		
		scoreArr[0] = 80;
		scoreArr[1] = 95;
		scoreArr[2] = 83;
		scoreArr[3] = 100;
		
		int sum = scoreArr[0] + scoreArr[1] + scoreArr[2] + scoreArr[3];
		double avg = (double) sum / 4;
		System.err.println("Array로 구한 평균은: " + avg);
		
		// List
		List<Integer> scoreList = new ArrayList<>();
		scoreList.add(100);
		scoreList.add(85);
		scoreList.add(90);
		scoreList.add(99);
		
		sum = scoreList.get(0) + scoreList.get(1) + scoreList.get(2) + scoreList.get(3);
		avg = (double) sum / 4;
		System.err.println("List로 구한 평균은: " + avg);

		
		// Map
		Map<String, Integer> scoreMap = new HashMap<>();
		scoreMap.put("수학", 90);
		scoreMap.put("물리", 100);
		scoreMap.put("영어", 90);
		scoreMap.put("프로그래밍", 93);
		
		sum = scoreMap.get("수학") + scoreMap.get("물리") + scoreMap.get("영어") + scoreMap.get("프로그래밍");
		avg = (double) sum / 4;
		System.err.println("Map으로 구한 평균은: " + avg);	
	}
}
