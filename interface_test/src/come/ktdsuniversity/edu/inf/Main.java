package come.ktdsuniversity.edu.inf;

public class Main {
	
	public static void calculate(Calculator calculator) {
		System.out.println(calculator);
		if (calculator instanceof CalculatorNormalImpl) {
			System.out.println(calculator.sum(10, 20));
			System.out.println(calculator.minus(40, 3));
		}
	}
	
	
	public static void main(String[] args) {
		
		calculate(new CalculatorNormalImpl());
		calculate(new CalculatorRandomImpl());
		
		
		
		// 인터페이스를 가지고 만든 애들은 이런 형태로 만듦.
		// 인터페이스명 변수명 = new 구현클래스명();
		
//		Calculator calculator1 = new CalculatorNormalImpl();
//		System.out.println(calculator1.sum(10, 20));
//		System.out.println(calculator1.minus(40, 3));
//		
//		Calculator calculator3 = new CalculatorRandomImpl();
//		System.out.println(calculator3.sum(10, 20));
//		System.out.println(calculator3.minus(40, 3));
	
	
	}
}
