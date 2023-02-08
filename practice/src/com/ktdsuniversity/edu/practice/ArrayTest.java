package com.ktdsuniversity.edu.practice;

public class ArrayTest {

	
	public static void main(String[] args) {
		
		// int - 자바의 배열 선언
		int[] scores = new int[4];
		
		// C언어 스타일
		int scores2[] = new int[4];

		
		// double
		double[] subject = new double[3];
		
		// String
		String[] str = new String[5];
		
		
		// 배열에 값 할당
		scores[0] = 1;
		scores[1] = 2;
		scores[2] = 3;
		scores[3] = 4;
		
		scores2[0] = 10;
		scores2[1] = 20;
		scores2[2] = 30;
		scores2[3] = 40;
		
		subject[0] = 0.1;
		subject[1] = 0.2;
		subject[2] = 0.3;
		
		str[0] = "a";
		str[1] = "b";
		str[2] = "c";
		str[3] = "d";
		str[4] = "e";
		
		
		
		System.out.println(scores);
		System.out.println(scores2);
		System.out.println(subject);
		System.out.println(str);
		
		// 배열은 레퍼런스 타입이다
		
		System.out.println(scores.length);
		System.out.println(scores2.length);
		System.out.println(subject.length);
		System.out.println(str.length);
		
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		
		int total = scores[0] + scores[1] + scores[2] + scores[3];
		System.out.println(total);
		
	}
}
