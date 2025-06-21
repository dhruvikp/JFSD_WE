package com.array;

public class ArrayExample {

	public static void main(String[] args) {
		int[][] arr2 = {{1,2}, {3,4}, {5,6}};
		
		// Access and Traversing 2D array
		System.out.println(arr2[0][0]);
		
		for(int row=0; row<arr2.length; row++) {
			for(int col=0; col<arr2[row].length; col++) {
				System.out.print(arr2[row][col] + " ");
			}
			System.out.println();
		}
		
		// Inserting/ Updating/ Removing
		arr2[1][1] = 10;
		for(int row=0; row<arr2.length; row++) {
			for(int col=0; col<arr2[row].length; col++) {
				System.out.print(arr2[row][col] + " ");
			}
			System.out.println();
		}
		
	}
}
