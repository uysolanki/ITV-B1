package day12;

import java.util.Scanner;

public class FunctionScenerio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Lenght");
		int length=sc.nextInt();
		System.out.println("Enter Width");
		int width=sc.nextInt();		
		
		double result=areaRect(length,width);
		System.out.println("Area of Rectangle is "+result);

	}

	private static double areaRect(int length, int width) {
		double result=length*width;
		return result;
	}

}
