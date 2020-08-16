package com.ashokit.assignment01;

public class MinAndMaxValueOfArray {
	public static void main(String args[]) {
		int array[] = new int[] {1, 2, 5, 5, 6, 6, 7, 2};

		int max = getMax(array);
		System.out.println("Maximum Value is: " + max);

		int min = getMin(array);
		System.out.println("Minimum Value is: " + min);
	}

	public static int getMax(int[] inputArray) {
		int maxValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}

	public static int getMin(int[] inputArray) {
		int minValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}
}
