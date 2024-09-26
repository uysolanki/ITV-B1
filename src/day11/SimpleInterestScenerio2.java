package day11;

import java.util.Scanner;

public class SimpleInterestScenerio2 {

	public static void main(String[] args)   //caller function/method
	{						//1 * 8 = 8
		System.out.println("Simple Interest Is "+ simpleInterest());    
	}

	private static double simpleInterest()  	//callee function/method		
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle");
		double principle=sc.nextDouble();	
		System.out.println("Enter Rate of Interest");    					 //3 * 8 =24
		double rate=sc.nextDouble();
		System.out.println("Enter Number of Years");
		double years=sc.nextDouble();
		
		return (principle*rate*years)/100;
	}
}
