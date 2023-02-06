package com.ktdsuniversity.edu.lambda;

public class Main {

	public static void main(String[] args) {

		Computable calc = new Computable() {

			@Override
			public int sum(int numberOne, int numberTwo) {
				return numberOne + numberTwo;
			}

			@Override
			public int minus(int numberOne, int numberTwo) {
				return numberOne - numberTwo;
			}
		};

		System.out.println(calc.sum(10, 20));
		System.out.println(calc.minus(10, 50));

	}
}
