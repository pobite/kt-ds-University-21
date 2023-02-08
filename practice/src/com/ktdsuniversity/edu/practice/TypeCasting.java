package com.ktdsuniversity.edu.practice;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		
		int math = 80;
		int physics = 85;
		int english = 88;
		int programming = 95;
		
		int sum = math + physics + english + programming;
		double avg = (double)sum / 4;
		
		System.out.println("4가지 과목의 평균은 " + avg + "입니다.");
		
	}
}
