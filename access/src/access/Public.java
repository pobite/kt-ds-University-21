package access;

/**
 * 모든 변수가 public인 클래스
 * @author User
 */
public class Public {
	
	/**
	 * 첫 번째 멤버 변수 
	 * @param args
	 */
	private int numberOne;
	
	/**
	 * 두 번째 멤버변수
	 * 멤버변수는 항상 private으로 보호되어야 한다.
	 */
	private int numberTwo;
	
	
	
	/**
	 * numberOne 멤버변수의 Getter
	 * @return numberOne
	 */
	public int getNumberOne() {
		return numberOne;
	}
	
	/**
	 * numberOne 멤버변수의 Setter
	 * @param numberOne (Main 클래스가 할당한 값)
	 */
	public void setNumberOne(int numberOne) {
		if (numberOne < 100) {
			this.numberOne = numberOne;
		}	
	}
	
	/**
	 * numberTwo 멤버변수의 Getter
	 * @return
	 */
	public int getNumberTwo() {
		return numberTwo;
	}
	
	/**
	 * numberTwo 멤버변수의 Setter
	 * @param numberTwo
	 */
	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}
	
	
	void add() {
		int result = numberOne + numberTwo;
		System.out.println(result);
	}
	
}
