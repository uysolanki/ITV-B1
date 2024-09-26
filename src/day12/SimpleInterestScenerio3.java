package day12;

import java.util.Scanner;

public class SimpleInterestScenerio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int principle=sc.nextInt();
		System.out.println("Enter the Intrest Rate");
		float intrest=sc.nextFloat();
		System.out.println("Enter the loan Tenure");
		byte years=sc.nextByte();
		
		double result=simpleInterst(principle,intrest, years);
		System.out.println("Simple Interes is "+result );
	}

	private static double simpleInterst(int p, float i, byte y) {
		double si=(p*i*y)/100;
		return si;
	}
}
