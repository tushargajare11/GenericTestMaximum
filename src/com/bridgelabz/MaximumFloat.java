package com.bridgelabz;
import java.util.Scanner;

public class MaximumFloat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter float number1: ");
        float floatFirst = sc.nextFloat();
        System.out.println("enter float number2: ");
        float floatSecond = sc.nextFloat();
        System.out.println("enter float number3: ");
        float floatThird = sc.nextFloat();
        
        maximumFloat(floatFirst, floatSecond, floatThird);
		System.out.println("The Maximum Float Number is: " + maxFloat);
	}
	static Float maxFloat;
	public static Float maximumFloat(Float floatFirst, Float floatSecond, Float floatThird) {
    maxFloat = floatFirst;
		
		if(floatSecond.compareTo(maxFloat) > 0)
		{
			maxFloat = floatSecond;
		}
		if(floatThird.compareTo(maxFloat) > 0)
		{
			maxFloat = floatThird;
		}
		return maxFloat;
	}

}
