package com.array;

public class MatrixAddition {

	public static void main(String[] args) {
		int[][] A = { 
				{ 1, 3, 5 }, 
				{ 2, 4, 6 } 
			};

		int[][] B = { 
						{ 7, 9, 11 }, 
						{ 8, 10, 12 } 
					};
		
		/*
		 *  	8 	12 	16
		 * 		10 	14 	18
		 */
		
		int rows = A.length;
		int cols = A[0].length;

		int[][] C = new int[rows][cols];
		
		for(int i=0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		// Print result:
		for(int[] row : C) {
			for(int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
}
