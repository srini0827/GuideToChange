package com.algorithm.sort.merge;

import java.util.Arrays;

public class MergeSorting {

	public static void main(String[] args) {
		int[] intArr = {10,2,8,7,6,3, 12, 11, 14};
		MergeSorting mergeSorting = new MergeSorting();
		mergeSorting.mergeSort(intArr, 0, intArr.length-1);
		
		System.out.println("Sorted Arrays ->" + Arrays.toString(intArr));
	}
	
	public void mergeSort(int[] intArr, int start, int end) {
		if(start < end) {
			int mid = (start + end)/2;
			
			//Sort first and second halves
			mergeSort(intArr, start, mid);
			mergeSort(intArr, mid + 1, end);
			
			//Merge the sorted halves
			merge(intArr, start, mid, end);
		}
	}

	private void merge(int[] intArr, int start, int mid, int end) {
		int n1 = mid - start + 1;
		int n2 = end - mid;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(int i = 0 ; i < n1 ; i++) {
			left[i] = intArr[start + i];
		}
		for(int j = 0 ; j < n2 ; j++) {
			right[j] = intArr[mid + 1 + j];
		}
		
		int i = 0;
		int j = 0;
		for (int k = start; k <= end; k++) {
			if ((j >= right.length) || (i < left.length && left[i] <= right[j])) {
				intArr[k] = left[i];
				i++;
			} else {
				intArr[k] = right[j];
				j++;
			}
		}
	}
}
