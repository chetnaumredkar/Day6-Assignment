package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = obj.nextInt();
		System.out.print(a + " " + b);
		for (int i = 1; i < n; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;

		}
	}
}