package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		// int a=1;int b=2;
		int temp = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = obj.nextInt();
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println(n + " is  a Prime Number");
		} else {

			System.out.println(n + "is not a Prime Number");
		}
	}
}
