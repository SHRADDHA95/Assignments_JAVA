package com.hackerrank;

public class LoopIteration {

	public static void main(String args[]) {

		/*
		 * loop will run infinite times as value of a is decreasing with each
		 * iteration and to exit the loop a has to be greater than b as
		 * per the condition here
		 */
		int a = 5;
		int b = 12;
		while (a <= b) {
			a = b / a;
			System.out.println("Inside loop");
		}
	}

}
