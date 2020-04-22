package com.hackerrank.marsexploration;

public class MarsExploration {

	static int marsExploration(String s) {
		int numberOfChangedLetters = 0;

		for (int i = 0; i < s.length(); i++) {
			if (i % 3 == 0 && s.charAt(i) != 'S') {
				numberOfChangedLetters++;
			} else if (i % 3 == 1 && s.charAt(i) != 'O') {
				numberOfChangedLetters++;
			} else if (i % 3 == 2 && s.charAt(i) != 'S') {
				numberOfChangedLetters++;
			}
		}
		return numberOfChangedLetters;
	}

	public static void main(String[] args) {
		System.out.println(marsExploration("SOSSPSSQSSOR")); // Output is 3
		System.out.println(marsExploration("SOSSOT")); // Output is 1
		System.out.println(marsExploration("SOSSOSSOS")); // Output is 0
	}

}
