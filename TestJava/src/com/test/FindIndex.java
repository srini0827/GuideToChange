package com.test;

public class FindIndex {

	public static void main(String[] args) {
		int[] a = {2,3,4,5,7};
		findIndex(a, 10);

	}
	
	public static void findIndex(int[] a, int b) {
		int currIndx = 0;
		int nextIndx = 0;
		int currValue = 0;
		int reminder = 0;
		
		for(int i = 0 ; i < a.length ; i++) {
			if(reminder > 0 && reminder == a[i]) {
				nextIndx = i;
				return;
			} else {
				currValue = a[i];
				currIndx = i;
				reminder = b - currValue;
			}
		}
		System.out.println(currIndx + "-" + nextIndx);
	}

}
