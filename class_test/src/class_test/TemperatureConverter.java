package class_test;

public class TemperatureConverter {
	
	public void toFah() {
		int cel = 31;
	
		double fah = (cel * 1.8) + 32;
		System.out.println(cel + " -> " + fah);
	}
	
	
	public void toCel() {
		double fah = 87.6;
		System.out.println(fah + " -> " + fah);
		
	}
	

	
}
