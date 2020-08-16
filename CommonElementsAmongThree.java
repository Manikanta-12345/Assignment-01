package com.ashokit.assignment01;

import java.util.ArrayList;

public class CommonElementsAmongThree {
	public static void main(String[] args) {
		ArrayList<Integer> common = new ArrayList<Integer>();
		int array1[] = { 1, 5, 10, 20, 40, 80 };
		int array2[] = { 6, 7, 20, 80, 100 };
		int array3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
		int x = 0, y = 0, z = 0;
		while (x < array1.length && y < array2.length && z < array3.length) {
			if (array1[x] == array2[y] && array2[y] == array3[z]) {
				common.add(array1[x]);
				x++;
				y++;
				z++;
			} else if (array1[x] < array2[y])
				x++;
			else if (array2[y] < array3[z])
				y++;
			else
				z++;
		}
		System.out.println("Common elements from three sorted (in non-decreasing order ) arrays: ");
		System.out.println(common);
	}
}