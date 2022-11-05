package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = ss.nextInt();
		int reverse = 0;
		for (; a != 0;) {
			int remainder = a % 10;
			reverse = reverse * 10 + remainder;
			a = a / 10;
		}
		System.out.println("The reverse of number is" + reverse);

	}
}
