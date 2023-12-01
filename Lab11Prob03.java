/**
* File: PAssign0.java
* Class: CSCI 1302
* Author: Matthew Molnar, Bao Pham
* Created on: Dec 1, 2023
* Last Modified: Dec 1, 2023
* Description: Recursion
*/
public class Lab11Prob03 {
	
	public static String reverseString(String s) {
	 return reverseString(s, s.length() - 1);
	}
	
	public static String reverseString(String s, int n) {
	
		if (n > 0) {
			return s.charAt(n) + reverseString(s, n-1);
		} else {
			return "" + s.charAt(0);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("Test"));
	}
}
