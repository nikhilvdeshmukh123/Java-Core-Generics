package com.bridgelabz;

public class Testmaximum {
	// Method to find Maximum Integer
	public void maxElement(Integer[] intArray) {
		for (int i = 0; i < intArray.length - 1; i++) {
			if (intArray[i].compareTo(intArray[i + 1]) == 1) {
				intArray[i + 1] = intArray[i];
			}
		}
		System.out.println("Maximum Integer: " + intArray[intArray.length - 1]);
	}
	// Method to find Maximum Float
	public void maxElement(Float[] inputArray) {
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i].compareTo(inputArray[i + 1]) == 1) {
				inputArray[i + 1] = inputArray[i];
			}
		}
		System.out.println("Maximum Float: " + inputArray[inputArray.length - 1] + "f");
	}
	// Method to find Maximum String
	public void maxElement(String[] inputArray) {
		for(int i=0; i<inputArray.length-1; i++) {
			if(inputArray[i].compareTo(inputArray[i+1]) > 0) {
				inputArray[i+1] = inputArray[i];
			}
		}
		System.out.println("Maximum String: " + inputArray[inputArray.length - 1]);
	}
}