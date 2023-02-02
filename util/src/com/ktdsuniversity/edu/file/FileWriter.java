package com.ktdsuniversity.edu.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriter {
	
	public static File createNewFile() throws IOException {
		File textFile = new File("C:\\l5ogs", "test.txt");
		textFile.createNewFile();
		return textFile;
	}
	
	public static File createNewFileThrowsRuntimeException() {
		File textFile = new File("C:\\logssss", "test.txt");
		try {
			textFile.createNewFile();
		} catch (IOException ioe) {		
//			throw new RuntimeException(ioe.getMessage(), ioe);
		}
		return textFile;
	}
	public static File createNewFileThrowsRuntimeException2() throws IOException{
		File textFile = new File("C:\\logssss", "test.txt");
		textFile.createNewFile();
		return textFile;
	}
		
	public static void main(String[] args) {

//		File textFile = new File("C:\\logs", "test22.txt");
		File textFile = new File("C:\\logs");
		OutputStream fos = null;
		createNewFileThrowsRuntimeException();
		createNewFileThrowsRuntimeException2();
		if (textFile.isDirectory()) {

			try {
				fos = new FileOutputStream(textFile);
				fos.write("파일 내용을 씁니다.".getBytes());
				fos.flush();
				fos.close();
			} catch (FileNotFoundException e) {
//				e.printStackTrace();
			} catch (IOException e) {
//				e.printStackTrace();
			}
			finally {
				
				if (fos != null) {
					try {
						fos.close();
					} catch (IOException e) {}
				}
			}
		}
		
		
//		createNewFileThrowsRuntimeException();
		
		
//		try {
//			createNewFile();
//		}
//		catch (IOException ioe) {
//			System.out.println("에러가 발생했습니다." + ioe.getMessage());
//		}
	}
	
}
