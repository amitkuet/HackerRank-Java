package com.hackerrank.radiotransmitter;

import java.util.Arrays;

public class Solution {

	static int hackerlandRadioTransmitters(int[] x, int k) {
		Arrays.sort(x);
		int length = x.length;
		int counter = 0;
		int i = 0;

		while (i < length) {
			counter++;
			int houseNumber = x[i] + k;

			while (i < length && houseNumber >= x[i]) {
				i++;
			}
			houseNumber = x[--i] + k;

			while (i < length && houseNumber >= x[i]) {
				i++;
			}
		}

		return counter;
	}

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5 };
		System.out.println(hackerlandRadioTransmitters(x, 1)); // Output is 2

		int[] x2 = { 7, 2, 4, 6, 5, 9, 12, 11 };
		System.out.println(hackerlandRadioTransmitters(x2, 2)); // Output is 3
	}

}
