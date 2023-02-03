package com.ktdsuniversity.edu.recursive;

import java.io.File;

public class Recursive {
	
	public void recursive() {
		System.out.println("실행중....");
		recursive();
	}
	

	public void readFile(File file) {
		File[] fileList = file.listFiles();
		for (File file2 : fileList) {
			System.out.println(file2.getName());
			// 반복 중인 객체가 폴더라면
			if (file2.isDirectory()) {
				readFile(file2);				
			}
		}
	}
	
	
	public static void main(String[] args) {
		Recursive recursive = new Recursive();
//		recursive.recursive();
		recursive.readFile(new File("C:\\Devs"));
	}
}