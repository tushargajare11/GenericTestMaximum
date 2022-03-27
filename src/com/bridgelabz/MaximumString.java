package com.bridgelabz;
import java.util.Scanner;

public class MaximumString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter first string: ");
        String stringFirst = sc.next();
        System.out.println("enter second string: ");
        String stringSecond = sc.next();
        System.out.println("enter third string: ");
        String stringThird = sc.next();
        
        maximumString(stringFirst, stringSecond, stringThird);
		System.out.println("The Maximum String Number is: " + maxString);
	}
	static String maxString;
	public static String maximumString(String stringFirst, String stringSecond, String stringThird)
	{
		maxString = stringFirst;
		
		if(stringSecond.compareTo(maxString) > 0)
		{
			maxString = stringSecond;
		}
		if(stringThird.compareTo(maxString) > 0)
		{
			maxString = stringThird;
		}
		return maxString;
	}

}
