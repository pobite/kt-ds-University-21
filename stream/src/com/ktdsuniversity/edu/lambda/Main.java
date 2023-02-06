package com.ktdsuniversity.edu.lambda;

public class Main {
	
	
	public static void printSumResult(Computable computable) {
		
		int sumResult = computable.sum(10, 30);
		System.out.println(sumResult);
	}
	
	
	public static void main(String[] args) {
		// 익명 클래스
		printSumResult(new Computable() {
			@Override
			public int sum(int numberOne, int numberTwo) {
				return numberOne + numberTwo;
			}
		});
		
		// 람다 함수
		printSumResult( (num1, num2) -> num1 + num2);
	}
}
