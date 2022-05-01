package com.bridgelabz;

/*
 * @author: Nikhil Deshnukh
 * Extend the max method to take more then three parameters
 */
public class Main {
	// Main method
	public static void main(String[] args) {
		// Creating object of TestMaxinum class
		Integer[] i = { 2, 6, 4 };
		String[] s = { "mango", "strawberry", "Grapes" };
		Float[] f = { 1.4f, 3.3f, 3.4f };
		new Testmaximum(i).maxElement();
		new Testmaximum(s).maxElement();
		new Testmaximum(f).maxElement();
	}
}