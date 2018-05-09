package com.test;

import java.util.Arrays;
import java.util.Random;

public class FindSequentialElements {

	public static void main(String ar[]){
		
		int elementCOunt = Integer.parseInt(ar[0]);
		int a[] = new int[elementCOunt];
		int j=0;
		Random r = new Random();
		while(elementCOunt>0){
			a[j] = r.nextInt(1000);
			j++;
			elementCOunt--;
		}
		Arrays.sort(a);
		
		int temp;
		elementCOunt = Integer.parseInt(ar[0]);
		for(int i=0;i<elementCOunt;i++){
			temp=a[i];
			if((i != elementCOunt-1) && temp+1 == a[i+1]){
				System.out.println(temp);
				
			}else if(i>0 && temp-1 == a[i-1]){
				System.out.println(temp);
			}
		}
		
	}
	
}
