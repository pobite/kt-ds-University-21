package com.ktdsuniversity.edu.util;

public abstract class NumberUtil {
	
	private NumberUtil() {}
	
	public static byte toByte(String string) {
		try {
			return Byte.parseByte(string);
		}
		catch (NumberFormatException nfe) {
			return 0;
		}
	}
	
	public static byte toByte(String string, byte defaultValue) {
		try {
			return Byte.parseByte(string);
		}
		catch (NumberFormatException nfe) {
			return defaultValue;
		}
	}
	
	
	
}
