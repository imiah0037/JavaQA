package com.string.demo;

public class StringReverseDEmo {

	public static void main(String[] args) {
		/**
		 * @author Ibrahim Miah
		 * How to reverse a String
		 */
		String s = "Selenium";
		int len = s.length();
		System.out.println("Lenghth of s: " + len);
		// using for loop
		String rev = "";
		System.out.println("++++++++++++++++++Using ForLoop++++++++++++++++++++");
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println("String reverse using for loop: " + rev);
		
		System.out.println("++++++++++++++++++Using StringBuffer++++++++++++++++++++");
		StringBuffer sb = new StringBuffer(s);
		System.out.println("String reverse using String buffer: "+sb.reverse());

		
	}

}
