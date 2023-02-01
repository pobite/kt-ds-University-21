package com.ktdsuniversity.edu.ext;

public class ExtendsTest {
	
	public static void print(Address address) {
		System.out.println(address.getName());
		System.out.println(address.getPhoneNumber());
		System.out.println(address.getAddress());
		
		if (address instanceof Friends) {
			Friends friend = (Friends) address;
			System.out.println(friend.getBithDay());
		}
	}
	
	public static void main(String[] args) {
		
		Friends friend = new Friends();
		friend.setName("DH");
		friend.setBithDay("2000-11-11");
		print(friend);
	}
}
