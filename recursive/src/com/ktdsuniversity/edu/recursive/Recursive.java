package com.ktdsuniversity.edu.recursive;

import java.io.File;

public class Recursive {
	
	public void recursive() {
		System.out.println("실행중....");
		recursive();
	}
	
	
	/**
	 * 재귀를 사용하지 않을 때
	 * 재귀의 필요성을 알려주기 위해
	 * @param 파일
	 */
	public void readFile(File file) {
		
		File[] fileList = file.listFiles();
		
		for (File file2 : fileList) {
			System.out.println(file2.getName());
			// 반복 중인 객체가 폴더라면
			if (file2.isDirectory()) {
				File[] fileList2 = file2.listFiles();
				for (File file3 : fileList2) {
					System.out.println(file3.getAbsolutePath());
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Recursive recursive = new Recursive();
//		recursive.recursive();
		recursive.readFile(new File("C:\\Devs"));
	}
}