package com.ktdsuniversity.edu.reference;

import java.util.ArrayList;
import java.util.List;

public class ListHelper {
	
	private List<Integer> intList;
	
//	public ListHelper() {
//		intList = new ArrayList<>();
//	}
	
	public void setIntList(List<Integer> intList) {
		this.intList = intList;
	}
	
	
	// 위에서 할당한 메모리 주소를 리턴
	public List<Integer> getIntList() {
		return intList;
	}
	
	public void addInteger(int value) {
		intList.add(value);
	}
	
	public int getSize() {
		return intList.size();
	}
	
}
