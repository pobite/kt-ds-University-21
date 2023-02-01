package come.ktdsuniversity.edu.inf;

public class CalculatorNormalImpl implements Calculator{

	@Override
	public int sum(int numberOne, int numberTwo) {
		return numberOne + numberTwo;
	}

	@Override
	public int minus(int numberOne, int numberTwo) {
		return numberOne - numberTwo;
	}
	
	public int divide(int numberOne, int numberTwo) {
		return numberOne / numberTwo;		
	}
	
	
}
