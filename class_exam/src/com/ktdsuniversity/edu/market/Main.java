package com.ktdsuniversity.edu.market;

public class Main {
	
	// 바이어에게 셀러를 참조하려는 것.
	public static void main(String[] args) {
								// 이름, 돈, 사과 개수
		Buyer buyer = new Buyer("장민창", 5_000_000, 0);
								// 이름, 돈, 사과 개수
		Seller seller = new Seller("LDH", 10_000_000, 10);
		
		
				// 판매자에게 5개 산다.
		buyer.buy(seller, 5);
		
		
	}
}
