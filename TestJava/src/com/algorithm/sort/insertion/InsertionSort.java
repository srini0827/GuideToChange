package com.algorithm.sort.insertion;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] intArr = {10,2,8,7,6,3, 12, 11, 14};
		insertionSort(intArr, intArr.length);
		System.out.println("Sorted Array -> " + Arrays.toString(intArr));
	}

	public static void insertionSort(int[] intArr, int length) {
		if(length <= 1) {
			return;
		}

		insertionSort(intArr, length - 1);
		
		int last = intArr[length - 1];
		int j = length - 2;
		
		while(j >= 0 && intArr[j] > last) {
			intArr[j+1] = intArr[j];
			j--;
		}
		intArr[j+1] = last;
	}
}
