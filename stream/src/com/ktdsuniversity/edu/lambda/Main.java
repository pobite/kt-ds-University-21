package com.ktdsuniversity.edu.lambda;

import java.util.Arrays;
import java.util.List;

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
		 * void 타입을 람다로.
		 */
		
		// 리턴 타입이라 이렇게 못 씀.
//		print( (data) -> data + "입니다.");	// 에러

		// 아래 것은 System.out.println도 리턴 타입이 void라 문제 안 생김.
		print( (data) -> System.out.println(data + "입니다."));
		
		print( System.out::println );

		print( (data) -> {
			System.out.println(data + "입니다.");
		});
		
		
		// 자바9부터 들어간 기술
		List<Integer> intList = List.of(10, 20, 30, 40, 50);
		
		//자바8도 비슷한 기술
		List<Integer> intList2 = Arrays.asList(10, 20, 30, 40);
		
		intList.forEach(System.out::println);
		intList2.forEach(System.out::println);
		
		
	}
}
