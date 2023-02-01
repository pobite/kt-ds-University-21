package calculator;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int sumResult = calc.sum(10, 10);
		int minusResult1 = calc.minus(10, 3);
		int minusResult2 = calc.minus(5, 10);
		int minusResult3 = calc.minus(5, 5);
		int multiResult = calc.multi(5, 2);
		double divideResult = calc.divide(50, 3);
		int remainResult = calc.remain(50, 3);
		
		System.out.println("sumResult = " + sumResult);
		System.out.println("minusResult1 = " + minusResult1);
		System.out.println("minusResult2 = " + minusResult2);
		System.out.println("minusResult3 = " + minusResult3);
		System.out.println("multiResult = " + multiResult);
		System.out.println("divideResult = " + divideResult);
		System.out.println("remainResult = " + remainResult);
		
	}
}
