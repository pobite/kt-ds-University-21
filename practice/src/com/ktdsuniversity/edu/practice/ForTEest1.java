package com.ktdsuniversity.edu.practice;

import java.util.ArrayList;
import java.util.List;

public class ForTEest1 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		/**
		 * 배열로 평균 구하기
		 */
		// 배열
		int[] scoreArr = new int[4];  
		
		scoreArr[0] = 80;
		scoreArr[1] = 95;
		scoreArr[2] = 83;
		scoreArr[3] = 100;
		
		for (int i = 0 ; i < scoreArr.length; i++) {
			sum += scoreArr[i];
		}
		
		double avg = (double) sum / scoreArr.length;
		System.out.println("Array를 for문으로 구한 평균: " + avg);
		
		/**
		 * List로 평균 구하기
		 */
		
		
		// List
		List<Integer> scoreList = new ArrayList<>();
		scoreList.add(100);
		scoreList.add(85);
		scoreList.add(90);
		scoreList.add(99);
		
		sum = 0;
		
		for(int i = 0; i < scoreList.size(); i++) {
			sum += scoreList.get(i);
		}
		avg = (double) sum / scoreList.size();
		
		System.out.println("List를 for문으로 구한 평균: " + avg);
		
	
	}
	
}
