package com.ashokit.assignment01;

public class MaximumDifferenceDemo {

	static void findGap(int [] a){
        int maximum_diff = 0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 1; j <a.length ; j++) {
                int x = a[i];
                int y = a[j];
                int diff = Math.abs(x-y);
                if(maximum_diff<diff)
                    maximum_diff = diff;
            }
        }
        System.out.println("Largest Gap between any two elements is: " +  maximum_diff);
    }

    public static void main(String[] args) {
        int [] b = { 2, 5, 1, 7, 3, 9, 5};
        findGap(b);
    }
}
