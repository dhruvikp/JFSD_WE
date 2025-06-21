package com;

public class Factorial {

	public static void main(String[] args) {

		int number = 20;

		long fact = 1;

		for (int i = 1; i <= number; i++) {
			fact *= i;
			// fact = fact * i
		}

		System.out.println(fact);

		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;

		System.out.println(arr[3]);

	}

	public int test(int[] input) {
		int a = 10; // O(1)
		a = a + 10; // O(1)

		for (int i = 0; i < input.length; i++) {
			boolean d = true; // O(n)
			a++; // O(n)
		}

		return a; // O(1)
	}

	// 3 + n+n = 3 + 2n == O(n)

	public void test1(int[] input1, int[] input2) {
		for (int i = 0; i < input1.length; i++) {
			System.out.println(i);
		}

		for (int i = 0; i < input2.length; i++) {
			System.out.println(i);
		}
	}
	// O(A+B)

	public void test2(int[] arr, int[] arr2) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				for (int k = 0; i < arr.length; k++) {
					System.out.println(k); // O(A*B*C)
				}
				System.out.println(j); // O(A*B)
			}
			System.out.println(i);
		}
	}

	public void test3(int x) {
		while (x > 0) {
			x /= 2;
		}
	}
	
	public void sum(int[] arr) {
		int sum = 0;
		
		for(int i=0; i< arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum : "+ sum);
	}
	// SPACE: O(1) above
	
	public int[] copyArray(int[] original) {
		
		int[] copy = new int[original.length];
		for(int i=0; i<original.length; i++) {
			copy[i] = original[i];
		}
		return copy;
		
	}
	
	// SPACE : O(n)
	
	
	

}
