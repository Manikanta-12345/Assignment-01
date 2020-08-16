package com.ashokit.assignment01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest_Smallest {
	public static void main(String[] args) {
		Integer[] input = { 1, 2, 5, 9, 6, 4, 7, 2 };
		int secondSmallest = getSecondSmallest(input);
		int secondmax = getSecondMax(input);
		System.out.println(secondSmallest);
		System.out.println(secondmax);
	}

	public static int getSecondSmallest(Integer[] a) {
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		int element = list.get(1);
		return element;
	}
	public static int getSecondMax(Integer[] a) {
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		Collections.reverse(list);
		int element = list.get(1);
		return element;
	}
}