package day10;

import java.util.Scanner;

public class FunctionScenerio2 {

	public static void main(String[] args) {
		int areaJr;
		areaJr=areaRectangle();									//call
		System.out.println("Area of Rectangle is "+areaJr);     //serve
 
	}

	private static int areaRectangle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Lenght");
		int length=sc.nextInt();
		System.out.println("Enter Width");
		int width=sc.nextInt();								//buy
		
		int areaNRC=length*width;							//cook
		
		return areaNRC;
		
	}

}
