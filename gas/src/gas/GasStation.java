package gas;

import java.util.ArrayList;
import java.util.List;

public class GasStation {

	// Ctrl + Shift + o
	private List<Fuel> fuelList;
	private int money;

	// 기본 생성자
	public GasStation() {
		fuelList = new ArrayList<>();
		fuelList.add(new Fuel(FuelType.GASOLIN, 5_000));
		fuelList.add(new Fuel(FuelType.DIESEL, 3_000));
		fuelList.add(new Fuel(FuelType.LPG, 1_000));
		
		setMoney(1_000_000);
		
	}
	
	
	
	
	// Alt > S > R > Alt+A > Alt+R
	
	public List<Fuel> getFuelList() {
		return fuelList;
	}

	public void setFuelList(List<Fuel> fuelList) {
		this.fuelList = fuelList;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	/**
	 * 판매
	 * @param type 연료 종류 (gasolin, diesel, lpg)
	 * @param stock 판매량
	 */
	public boolean sell(FuelType type, int stock) {
		boolean result = checkStock(type, stock);
		
		// 1. type 연료가 stock만큼 존재하는지 확인한다.
		if(result) {
			result = true;
			
			// 1-2. 연료가 충분하다면 type 연료의 잔량을 stock 만큼 줄인다.
			for (Fuel fuel: fuelList) {
				if(fuel.getType() == type) {
					int fuelStock = fuel.getStock();
					fuelStock = fuelStock - stock;
					fuel.setStock(fuelStock);
				}
			}
			
		// 1-2. 연료가 부족하다면 "연료가 부족합니다"를 출력하고 메소드를 종료한다.
		
		}else {
			result = false;
			System.out.println("연료가 부족합니다.");
		}
		return result;
	
	}
	
//  sell 메소드의 반복되는 3코드를 묶을 수 있다.
//	public void test(Fuel fuel, int stock) {
//		int fuelStock = fuel.getStock();
//		fuelStock -= stock;
//		fuel.setStock(fuelStock);
//	}
	
	/**
	 * 수입
	 * @param money 구매가격
	 */
	public void addMoney(int money) {
		// 1. money 파라미터의 값을 인스턴스 변수 money에 더한다.
		this.money += money;
	}
	
	/**
	 * type 연료가 stock 만큼 주유가능한지 확인
	 * @param type 연료종류
	 * @param stock 주유량
	 * @return 연료의 양이 stock 이상이면 true, 아니면 false
	 */
	private boolean checkStock(FuelType type, int stock) {
//		boolean result = false;
		
		for (Fuel fuel: fuelList) {
			if(fuel.getType() == type) {
//				result = fuel.getStock() >= stock;
//				break;
				return fuel.getStock() >= stock;
			}
			
		}
		return false;
	}
}