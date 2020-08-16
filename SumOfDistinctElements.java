package com.ashokit.assignment01;

import java.util.Arrays;

public class SumOfDistinctElements {

	public static void sumOfDistinct_Sorting(int[] arrA) {

		Arrays.sort(arrA);

		int current = arrA[0];
		int sum = arrA[0];
		for (int i = 1; i < arrA.length; i++) {
			if (current != arrA[i]) {
				sum += arrA[i];
				current = arrA[i];
			}
		}
		System.out.println("Sum of all Unique elements (Sorting Method): " + sum);
	}

	public static void main(String[] args) {
		int[] arrA = {1, 6, 4, 3, 2, 2, 3, 8, 1};
		sumOfDistinct_Sorting(arrA);
	}
}