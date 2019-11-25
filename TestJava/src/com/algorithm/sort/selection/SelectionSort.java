package com.algorithm.sort.selection;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] intArr = {10,2,8,7,6,3, 12, 11, 14};
		selectionSort(intArr, 0);
		System.out.println(Arrays.toString(intArr));

	}

	private static void selectionSort(int[] intArr, int i) {
		int smallestNo = 0;
		int k = i;

		for(int j = i ; j < intArr.length-1 ; j++) {
			if(smallestNo == 0) {
				smallestNo = intArr[j];
			}

			if(smallestNo > intArr[j]) {
				smallestNo = intArr[j];
				k = j;
			}
		}

		if(i != intArr.length) {
			int temp = intArr[i];
			intArr[i] = smallestNo;
			intArr[k] = temp;
		}

		if(i < intArr.length) {
			selectionSort(intArr, i + 1);
		}

	}

}
