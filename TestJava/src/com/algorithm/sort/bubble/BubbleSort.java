package com.algorithm.sort.bubble;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] intArr = {10,2,8,7,6,3, 12, 11, 14};
		bubbleSort(intArr, intArr.length);
		System.out.println("Sorted Array -> " + Arrays.toString(intArr));
	}

	private static void bubbleSort(int[] intArr, int length) {
		for(int i = 0 ; i < length-1; i++) {
			if(intArr[i] > intArr[i+1]) {
				int temp = intArr[i+1];
				intArr[i+1] = intArr[i];
				intArr[i] = temp;
			}
		}
		
		if(length > 0) {
			bubbleSort(intArr, length -1);
		}

	}



}
