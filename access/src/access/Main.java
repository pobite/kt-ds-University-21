package access;

public class Main {
	
	
	public static void main(String[] args) {
		
		Public pub = new Public();
		pub.add();
		
		int publicNumberOne = pub.getNumberOne();
		System.out.println(publicNumberOne);
		
		pub.setNumberOne(7);
		
		publicNumberOne = pub.getNumberOne();
		System.out.println(publicNumberOne);
		
		
		pub.add();
		
		int publicNumberTwo = pub.getNumberTwo();
		System.out.println(publicNumberTwo);
		
		pub.setNumberTwo(10);
		
		publicNumberTwo = pub.getNumberTwo();
		System.out.println(publicNumberTwo);
		
		pub.add();

		
	}
	
}
