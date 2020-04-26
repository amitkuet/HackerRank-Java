package com.hackerrank.smartnumber;

public class SmartNumber {

	public static boolean isSmartNumber(int num) {
		int val = (int) Math.sqrt(num);
		if (val * val == num)
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isSmartNumber(1)); // Output is true
		System.out.println(isSmartNumber(2)); // Output is false
		System.out.println(isSmartNumber(7)); // Output is false
		System.out.println(isSmartNumber(169)); // Output is true
	}

}
