package com.algorithm.search;

import com.algorithm.sort.insertion.InsertionSort;

public class SearchAnElement {

	public static void main(String[] args) {
		int[] intArr = {10,2,8,7,6,3, 12, 11, 14};
		int length = intArr.length - 1;
		InsertionSort.insertionSort(intArr, length);
		
		
		int index = binarySearch(1, intArr, 0, length);
		if(index != -1) {
			System.out.println("Element is in index -> " + index);
		} else {
			System.out.println("Element not found");
		}
			
	}

	private static int binarySearch(int search, int[] intArr, int left, int right) {
		if(right >= left) {
			int midPoint = left + (right - left)/2;
			
			if(search == intArr[midPoint]) {
				return midPoint;
			}
			
			if(search > intArr[midPoint]) {
				return binarySearch(search, intArr, midPoint + 1, right) ;
			}
			return binarySearch(search, intArr, left, midPoint - 1);
		}
		return -1;
	}

	
}
