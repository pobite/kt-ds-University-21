package com.ktdsuniversity.edu.practice;

import java.util.Scanner;

public class LoopTest {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int age = 0;
		
		/**
		 * 3회 반복
		 */
		for (int i = 0; i < 2; i++) {
			
			/**
			 * 나이 입력 받기
			 */
			age = scan.nextInt();
			scan.nextLine();
			
			/**
			 * 나이 판별
			 */
			if (age > 19) {
				System.out.println("성인입니다.");
			}
			else {
				System.out.println("미성년입니다.");
			}
		}
	}
}
