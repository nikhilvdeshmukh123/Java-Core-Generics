package com.bridgelabz;

public class Testmaximum {
	public void maxElement(Integer[] intArray) {
		for(int i=0; i<intArray.length-1; i++) {
			if(intArray[i].compareTo(intArray[i+1])==1) {
				intArray[i+1] = intArray[i];
			}
		}
		System.out.println("Maximum Integer: " + intArray[intArray.length-1]);
	}
}