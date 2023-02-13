package com.ktdsuniversity.edu.market;

public class Buyer {
	
	private String name;
	private int money;
	private int stock;
	
	public Buyer(String name, int money, int stock) {
		this.name = name;
		this.money = money;
		this.stock = stock;
	}
	
	public void buy(Seller seller, int orderCount) {
		this.money -= orderCount * 1000;
		this.stock += orderCount;
		seller.sell(orderCount);
	}
		
	
	
}
