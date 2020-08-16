package com.ashokit.assignment01;

public class SmallestPair {

	public static void findPair(int[] A) {
		if (A.length < 2) {
			return;
		}

		int low = 0;
		int high = A.length - 1;
		int min = Integer.MAX_VALUE;
		int i = 0, j = 0;
		while (low < high) {
			if (Math.abs(A[high] + A[low]) < min) {
				min = Math.abs(A[high] + A[low]);
				i = low;
				j = high;
			}

			if (min == 0) {
				break;
			}

			if (A[high] + A[low] < 0) {
				low++;
			} else {
				high--;
			}
		}

		System.out.print("Pair found (" + A[i] + ", " + A[j] + ")");
	}

	public static void main(String[] args) {
		int[] A = {1, 7, 2, 9, 6};

		findPair(A);
	}

}
