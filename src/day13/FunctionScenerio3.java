package day13;

import java.util.Scanner;

public class FunctionScenerio3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle");
		int principle=sc.nextInt();
		System.out.println("Enter rate of Interest");
		double roi=sc.nextInt();
		System.out.println("Enter number of years");
		byte noy=sc.nextByte();
		
		double result=calculateSinpleInterest(noy,principle,roi);   //actual parameters aka arguements
		System.out.println("Area of a Rectangle is "+result);
	}

	private static double calculateSinpleInterest(byte n,int p, double r) 
	{
		double si=(p*n*r)/100;
		return si;
	}

	

}
