package com.revature.eval.java.core;

public class MyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = '1';
		if (c == '1') {
			System.out.println("LEARN THIS");
		}
		System.out.println("in main " + cleanPhoneNumber("(223) 456-7890"));
		
		System.out.println("in main " + cleanPhoneNumber("223.456.7890"));
		System.out.println("in main " + cleanPhoneNumber("223 456   7890   "));
		System.out.println("in main " + cleanPhoneNumber("321234567890"));
		System.out.println("in main " + cleanPhoneNumber("123-abc-7890"));
		System.out.println("in main " + cleanPhoneNumber("123-@:!-7890"));
	}
	
	public static String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration
		string = string.replaceAll("[^\\d]", "");
		return string;
	}
	
	private static String concatArray(String[] toConcat) {
		StringBuilder sb = new StringBuilder();
		for (String s: toConcat)
			sb.append(s);
		return sb.toString();
	}

}
