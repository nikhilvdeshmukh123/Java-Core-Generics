package com.bridgelabz;

public class Testmaximum<T extends Comparable<T>> {
	private T[] intArray;

	Testmaximum(T[] intArray) {
		this.intArray = intArray;
	}

	public void maxElement() {
		for (int i = 0; i < intArray.length - 1; i++) {
			if (intArray[i].compareTo(intArray[i + 1]) > 0) {
				intArray[i + 1] = intArray[i];
			}
		}
		System.out.println("Maximum " + intArray[intArray.length - 1]);
	}
}