package com.hackerrank;

import java.util.Scanner;

public class Student {

	public void returnCalculatedMarks(int[] SUB1, int[] SUB2, int[] SUB3) {

		for (int k = 0; k < 20; k++) {
			int totalMarks = 0;
			for (int i = 0; i < 3; i++) {

				totalMarks = totalMarks + SUB1[i] + SUB2[i] + SUB3[i];

				System.out
						.println("Total Marks Obtained by STUDENT having ROLL NO"
								+ k + ":" + totalMarks);

			}

		}

	}

	public void calculateHighestMarks(int[] SUB, int k) {

		int max = SUB[0];
		int index = 0;

		for (int i = 0; i < 20; i++) {
			if (max < SUB[i]) {
				max = SUB[i];
				index = i;
			}
		}
		System.out.println("Higest marks in SUB :" + k
				+ " and ROLL NO of the student who obtained it:" + index);
	}

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Student obj = new Student();
		int SUB1[] = new int[20];
		int SUB2[] = new int[20];
		int SUB3[] = new int[20];

		for (int i = 0; i < 20; i++) {
			/* Marks in individual subjects, entered by user */
			SUB1[i] = scanner.nextInt();
			SUB2[i] = scanner.nextInt();
			SUB3[i] = scanner.nextInt();

		}
		/* calculates highest marks */
		obj.returnCalculatedMarks(SUB1, SUB2, SUB3);

		/*
		 * Highest Marks in each Subject 1 and Roll NO of the student who scored
		 * it:
		 */
		obj.calculateHighestMarks(SUB1, 1);
		/*
		 * Highest Marks in each Subject 2 and Roll NO of the student who scored
		 * it:
		 */
		obj.calculateHighestMarks(SUB2, 2);
		/*
		 * Highest Marks in each Subject 3 and Roll NO of the student who scored
		 * it:
		 */
		obj.calculateHighestMarks(SUB3, 3);
	}

}
