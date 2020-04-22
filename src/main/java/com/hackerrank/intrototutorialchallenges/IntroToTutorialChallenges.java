package com.hackerrank.intrototutorialchallenges;

public class IntroToTutorialChallenges {

	static int introTutorial(int V, int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (V > arr[mid]) {
				left = mid + 1;
			} else if (V < arr[mid]) {
				right = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 7, 9, 12 };
		System.out.println(introTutorial(4, arr)); // Output is 1
	}

}
