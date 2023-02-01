package pharmacy;


public class Main {

	DrugStore drugStore = new DrugStore();
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.drugStore.visit();
		main.drugStore.prescribe();
		
	}
	
}
