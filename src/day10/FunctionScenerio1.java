package day10;

import java.util.Scanner;

public class FunctionScenerio1 {

	public static void main(String[] args) {
		
		areaRectangle();									//call
	}

	
	private static void areaRectangle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Lenght");
		int length=sc.nextInt();
		System.out.println("Enter Width");
		int width=sc.nextInt();								//buy
		
		int area=length*width;								//cook
		
		System.out.println("Area of Rectangle is " + area); //serve	
	}

}
