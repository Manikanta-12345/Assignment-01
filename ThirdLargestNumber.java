package com.ashokit.assignment01;

import java.util.Arrays;

public class ThirdLargestNumber {
	public static void main(String args[]) {
		int array[]  = { 6};
         int max=thirdLargest(array);
		System.out.println("3rd largest element is :" + max);
	}

	public static int thirdLargest(int[] array) {
		if (array.length < 3) {
			System.out.println("Invalid Input, array size is less than 3");
		throw new IllegalArgumentException("Invalid Input, array size is less than 3");
		}
		int size = array.length;
		Arrays.sort(array);
		int max = array[size - 3];

		return max;
	}
}