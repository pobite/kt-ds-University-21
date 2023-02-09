package com.ktdsuniversity.edu.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomTest {
	

	public static void main(String[] args) {
		
 
		/**
		 * 1. 랜덤 숫자 50개를 List에 넣고 그 중 가장 큰 숫자 하나를 출력한다.
		 * 2. 랜덤 숫자 50개를 List에 넣고 그 중 가장 작은 숫자 하나를 출력한다.
		 * 3. 랜덤 숫자 50개를 List에 넣고 그 중 평균 값(정수형)과 같은 숫자 하나를 출력한다. 없으면 0 을 출력한다.
		 */
		
		List<Integer> randomList = new ArrayList<>();
		Random random = new Random();
	
		/**
		 * 1. 랜덤 숫자 50개를 List에 넣고 그 중 가장 큰 숫자 하나를 출력한다.
		 */
		int max = 0;
		int num = 0;
		for (int i = 0; i< 50; i ++) {
			num = random.nextInt(50) + 1;
			
			if (num > max) {
				max = num;
			}
			randomList.add(num);
		}
		System.out.println(max);
		randomList.clear();

		/**
		 * 2. 랜덤 숫자 50개를 List에 넣고 그 중 가장 작은 숫자 하나를 출력한다.
		 */
		
		int min = 51;
		num = 0;
		for (int i = 0; i< 50; i ++) {
			num = random.nextInt(50) + 1;
			
			if (num < min) {
				min = num;
			}
			randomList.add(num);
		}
		System.out.println(min);
		randomList.clear();
		
		/**
		 * 3. 랜덤 숫자 50개를 List에 넣고 그 중 평균 값(정수형)과 같은 숫자 하나를 출력한다. 없으면 0 을 출력한다.
		 */
		int sum = 0;
		for (int i = 0; i< 50; i ++) {
			num = random.nextInt(50) + 1;
			sum += num;
			randomList.add(num);
		}
		
		int avg = sum / randomList.size();
		
		// 있으면
		if (randomList.indexOf(avg) >= 0) {
			System.out.println(avg);
		}
		// 없으면
		else {
			System.out.println(0);
		}
	}
}
