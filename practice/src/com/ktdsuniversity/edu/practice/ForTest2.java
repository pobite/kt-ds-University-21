package com.ktdsuniversity.edu.practice;

import java.util.Random;

public class ForTest2 {

	public static void main(String[] args) {
		/**
		 * 0 ~ 99까지 출력
		 */
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		/**
		 * 0 ~ 99까지 출력 && 5의 배수 출력
		 */
		
		for (int i = 0; i < 100; i++) {
			
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
		
		/**
		 * 0 ~ 99까지 출력 && 5의 배수 출력 && 0 출력 x
		 */
		
		for (int i = 0; i < 100; i++) {
			if (i == 0) {
				continue;
			}
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
		
		/**
		 * 0 ~99까지
		 * 짝수면 짝수입니다 출력
		 * 홀수면 홀수입니다 출력
		 */
		
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println("짝수입니다.");
			}
			else {
				System.out.println("홀수입니다.");
			}
		}
		
		/**
		 * 정수형 배열, 인덱스의 개수는 50개
		 * 배열 50개의 랜덤 값 삽입
		 */
		
		int[] arr = new int[50];
		Random random = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(50) + 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
