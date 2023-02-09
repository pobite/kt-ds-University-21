package com.ktdsuniversity.edu.practice;

public class BoolenaTest {

	
	public static void main(String[] args) {
		
		String grade = "";
		int avg = 93;
		int attendance = 5;
		
		boolean isSuccess = false;
		boolean isNoAttendance = false;
		
		/**
		 *  평균이 90점을 넘는지
		 */
		if (avg > 90) {
			isSuccess = true;
		}
		
		/**
		 * 지각, 결석이 0회인지
		 */
		if (attendance == 0) {
			isNoAttendance = true;
		}
		
		/**
		 * 두 조건 모두 해당 되는지
		 */
		if (isSuccess && isNoAttendance) {
			grade = "A";
		}
		
		
		/**
		 * 영화 관람 가능 여부 확인
		 * 18,000 / 12세
		 */
		
		int money = 15_000;
		int age = 27;
		
		boolean isMoneyEnough = false;
		boolean isAgeEnough = false;
		
		boolean isPossibleMovie = false;
		
		if (money >= 18_000) {
			isMoneyEnough = true;
		}
		if (age >= 12) {
			isAgeEnough = true;
		}
		
		if (isMoneyEnough && isAgeEnough) {
			isPossibleMovie = true;
		}
		
		
	}
}
