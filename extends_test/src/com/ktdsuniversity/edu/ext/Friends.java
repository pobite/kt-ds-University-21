package com.ktdsuniversity.edu.ext;

public class Friends extends Address {
	
	private String bithDay;

	
	public String getBithDay() {
		return bithDay;
	}

	public void setBithDay(String bithDay) {
		this.bithDay = bithDay;
	}
	
	@Override
	public String getAddress() {
		return "내 친구 주소는 " + super.getAddress();
	}
	
	@Override
	public String getName() {
		return "내 친구 이름은 " + super.getName();
	}
	
	@Override
	public String getPhoneNumber() {
		return "내 친구 전화번호는 " + super.getPhoneNumber();
	}
}
