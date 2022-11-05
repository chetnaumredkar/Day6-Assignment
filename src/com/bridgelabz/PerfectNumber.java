package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n=obj.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("The sum of Divisor of number"+n+"is"+sum);

		if(sum==n) {
			System.out.println("So"+n+"is a Perfect Number");
		}
			else {
				System.out.println(n+"is not a Perfect Number");

			}
		}
	}


