package class_test;

public class Calculator {
	
	public static void main(String[] args) {
		
		/*
		 * Primitive Type
		 * 	byte, short, int, long
		 * 	float, double
		 * 	char, boolean
		 * 
		 * 
		 * Reference Type
		 * 	Primitive Type을 제외한 모든 타입
		 * 
		 * 
		 * 변수의 생성 방법이 다름
		 * Primitive type
		 * 	Type name = value;
		 * 
		 * 
		 * Reference type
		 * 	Type name = new Type();
		 * 
		 *
		 * 왜 String은 레퍼런스 타입처럼 정의 안 했는지?
		 * 원래는 레퍼런스 타입처럼 정의하는 게 맞으나,
		 * 스트링의 경우만 Primitive type 형태로 정의와 할당됨.
		 * 
		 * 둘다 가능 
		 * String name = "장민창";
		 * String name2 = new String("장민창");		
		 * System.out.println(name);
		 * System.out.println(name2);
		 /*
		
		
		/* 인스턴스화, 객체화라고 부름
		 * 
		 * new 클래스명() - 생성자라고 부름
		 * 
		 *  */
		 ScoreCalculator scoreCalculator = new ScoreCalculator();
		 scoreCalculator.getAverage();
		 scoreCalculator.getGrade();
		 
		 /* 클래스는 사용하려면 인스턴스를 만들어야 함
		  * 변수로 만들어야 함
		  * 그것이  new 클래스 이름()
		  * 
		  * class_test.ScoreCalculator@370736d9
		  * @뒤가 메모리 주소
		  * 
		  * */
		 
		 
		 
		 TemperatureConverter temperatureConverter = new TemperatureConverter();
		 temperatureConverter.toCel();
		 temperatureConverter.toFah();
		 
		 
		 
		 
		 
		
		
	}
	
	
}
