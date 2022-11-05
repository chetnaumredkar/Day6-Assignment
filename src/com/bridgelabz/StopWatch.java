package com.bridgelabz;
import java.lang.*;
import java.util.Scanner;
public class StopWatch {
	public static void main(String[] args) {
		System.out.println("currenttime");
		System.out.println(System.currentTimeMillis());
		Scanner obj=new Scanner(System.in);
		long start,stop;
		long timeElasped;
		System.out.println("Type 1 to start program");
		int  s=obj.nextInt();
		start=	System.currentTimeMillis();
		System.out.println(start);
		System.out.println("Type 1 to stop program");
		int e=obj.nextInt();
		stop=	System.currentTimeMillis();
		System.out.println(stop);
		timeElasped=stop-start;
		System.out.println("the time elasped is "+timeElasped+"milisecond");
	}

}
