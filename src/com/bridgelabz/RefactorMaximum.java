package com.bridgelabz;
import java.util.Scanner;

public class RefactorMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter number1: ");
        int intFirst = sc.nextInt();
        System.out.println("enter number2: ");
        int intSecond = sc.nextInt();
        System.out.println("enter number3: ");
        int intThird = sc.nextInt();
        
        System.out.println("enter float number1: ");
        float floatFirst = sc.nextFloat();
        System.out.println("enter float number2: ");
        float floatSecond = sc.nextFloat();
        System.out.println("enter float number3: ");
        float floatThird = sc.nextFloat();
        
        System.out.println("enter first string: ");
        String stringFirst = sc.next();
        System.out.println("enter second string: ");
        String stringSecond = sc.next();
        System.out.println("enter third string: ");
        String stringThird = sc.next();
        
        System.out.println("The Maximum Integer Number is: " + maximum(intFirst,intSecond,intThird));	
		System.out.println("The Maximum Float Number is: " + maximum(floatFirst, floatSecond, floatThird));
		System.out.println("The Maximum String is: " + maximum(stringFirst, stringSecond,stringThird));
	}
	static Integer maxInt;
	static Float maxFloat;
	static String maxString;
	
	public static <E extends Comparable<E>> E maximum(E first,E second,E third) {
		E max = first;
		if(second.compareTo(max) > 0)
		{
			max = second;
		}
		if(third.compareTo(max) > 0)
		{
			max = third;
		}
		return max;
	}

}
