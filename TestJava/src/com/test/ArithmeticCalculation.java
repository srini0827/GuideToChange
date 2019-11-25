package com.test;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculation {

	public static void main(String a[]){
		
		char c[] ={'1','9','3','*','-','+','5'};
		
		List<Integer> numerics = new ArrayList<>();
		List<String> operands = new ArrayList<>();
		
		for(int i=0;i<c.length;i++){
			int asciiValue = (int)c[i];
			System.out.println(asciiValue);
			if(Character.isDigit(c[i])){
				numerics.add(Character.getNumericValue(c[i]));
			}else{
				operands.add(Character.toString(c[i]));
			}
		}
		System.out.println(numerics);
		System.out.println(operands);
		
		int numericSize = operands.size();
		int finalResult=0;
		for(;numericSize>=0;numericSize--){
			if(numericSize-1>=0){
			switch(operands.get(numericSize-1)){
			case "*": 
				if(numericSize != operands.size())
				finalResult = finalResult*numerics.get(numericSize-1);
				else
					finalResult = numerics.get(numericSize)*numerics.get(numericSize-1);
				break;
			case "+":
				if(numericSize != operands.size())
				finalResult += numerics.get(numericSize-1);
				else
					finalResult = numerics.get(numericSize)+numerics.get(numericSize-1);
				break;
			case "-":
				if(numericSize != operands.size())
				finalResult -= numerics.get(numericSize-1);
				else
					finalResult = numerics.get(numericSize)-numerics.get(numericSize-1);
				break;
			}

			}
			
		}
		System.out.println("finalResult:"+finalResult);
	}
}
