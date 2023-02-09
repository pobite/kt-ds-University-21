package com.ktdsuniversity.edu.practice;

public class LocalOperationTest {
	
	
	public static void main(String[] args) {
		
		int score = 98;
		String grade = "";
		/**
		 * else 사용
		 */
		
		if (score <= 100 && score >= 95) {
			grade = "A+";
		}
		else if (score < 95 && score >= 90 ) {
			grade = "A";
		}
		else if (score < 90 && score >= 85 ) {
			grade = "B+";
		}
		else if (score < 85 && score >= 80 ) {
			grade = "B";
		}
		else if (score < 80 && score >= 70 ) {
			grade = "C";
		}
		else if (score < 70 && score >= 60 ) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		/**
		 * else 없이 
		 */
		
		grade= "F";
		
		if (score <= 100 && score >= 95) {
			grade = "A+";
		}
		else if (score < 95 && score >= 90 ) {
			grade = "A";
		}
		else if (score < 90 && score >= 85 ) {
			grade = "B+";
		}
		else if (score < 85 && score >= 80 ) {
			grade = "B";
		}
		else if (score < 80 && score >= 70 ) {
			grade = "C";
		}
		else if (score < 70 && score >= 60 ) {
			grade = "D";
		}
		else if (score < 60 && score >= 0 ) {
			grade = "F";
		}
	}
}
