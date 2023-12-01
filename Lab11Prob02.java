/**
* File: PAssign0.java
* Class: CSCI 1302
* Author: Matthew Molnar, Bao Pham
* Created on: Dec 1, 2023
* Last Modified: Dec 1, 2023
* Description: Recursion
*/
public class Lab11Prob02 {
	
	public static String reverseString(String s) {
		// if there is a Char program returns single char
		if (s.length() == 1) {
			return s;
			
		// program returns new string reversed
		} else {
			return reverseString(s.substring(1)) + s.charAt(0);
		}
	}
	
	public static void main(String[] args) {
		System.out.print(reverseString("T"));
	}
}
