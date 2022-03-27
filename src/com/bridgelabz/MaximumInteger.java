package com.bridgelabz;
import java.util.Scanner;

public class MaximumInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("enter numer1: ");
        int intFirst = sc.nextInt();
        System.out.println("enter numer2: ");
        int intSecond = sc.nextInt();
        System.out.println("enter numer3: ");
        int intThird = sc.nextInt();

		maximumInteger(intFirst, intSecond, intThird);
		System.out.println("The Maximum Number is: "+ max);
	}
	static Integer max;
	public static int maximumInteger(Integer intFirst, Integer intSecond, Integer intThird) {
		max = intFirst;
		if(intSecond.compareTo(max) > 0)
		{
			max = intSecond;
		}
		if(intThird.compareTo(max) > 0)
		{
			max = intThird;
		}
		return max;
	}

}
