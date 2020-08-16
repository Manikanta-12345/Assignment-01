package com.ashokit.assignment01;

public class RemoveDuplicateElementDemo {

	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 5, 5, 6, 6, 7, 2};
		int current = input[0];
		boolean found = false;

		for (int i = 0; i < input.length; i++) {
			if (current == input[i] && !found) {
				found = true;
			} else if (current != input[i]) {
				System.out.print(" " + current);
				current = input[i];
				found = false;
			}
		}
		System.out.print(" " + current);
	}
}