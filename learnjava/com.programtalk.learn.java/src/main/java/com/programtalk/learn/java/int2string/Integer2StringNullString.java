package com.programtalk.learn.java.int2string;

public class Integer2StringNullString {

	public static void main(String[] args) {
		Integer intValue = null;
		String stringValue = String.valueOf(intValue);
		System.out.println(stringValue); // prints null
	}
}
