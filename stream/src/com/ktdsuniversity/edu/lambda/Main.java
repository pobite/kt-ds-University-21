package com.ktdsuniversity.edu.lambda;

public class Main {
	
	public static void print(Printable printable) {
		printable.print("DH");
	}
	
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
		
		// 람다 함수
		printSumResult( (num1, num2) -> {
			return num1 + num2;
		});
		
		
		/*
		 * void 타입을 람다로
		 */
		
		// 리턴 타입이라 이렇게 못 씀.
//		print( (data) -> data + "입니다.");	// 에러

		// 아래 것은 System.out.println도 리턴 타입이 void라 문제 안 생김.
		print( (data) -> System.out.println(data + "입니다."));
		print( (data) -> {
			System.out.println(data + "입니다.");
		});
	}
}
