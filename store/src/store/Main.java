package store;

/**
 * 실행 클래스
 * @author DH
 *
 */

public class Main {
	Store store = new Store();
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.store.addProducts();
		main.store.checkQuantity();
		
		
	}
	
	
	
}
