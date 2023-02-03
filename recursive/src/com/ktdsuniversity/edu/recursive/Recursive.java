package com.ktdsuniversity.edu.recursive;

public class Recursive {
	
	public void recursive() {
		System.out.println("실행중....");
		recursive();
	}
	
	public static void main(String[] args) {
		Recursive recursive = new Recursive();
		recursive.recursive();		
	}
	
}
