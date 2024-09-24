package day10;

import java.util.Scanner;

public class FunctionScenerio2Boardexam {

	public static void main(String[] args) {
		double myAvgPer;
		myAvgPer=boardExam();
		
		if(myAvgPer>=80.0)					//88.66
		{
			System.out.println("Scholar Student");
		}
		else
		{
			System.out.println("Regular Student");
		}

	}

	private static double boardExam() {
		Scanner sc=new Scanner(System.in);						//A		   B
		System.out.println("Please enter your SSC percentage"); //90.15    60 
		double sscPer=sc.nextDouble();
		
		System.out.println("Please enter your HSC percentage"); //87.15    70
		double hscPer=sc.nextDouble();
		
		double totalPer=sscPer+hscPer;							//177.30   130
		
		double avgPer=totalPer/2;								//88.66    65
		return avgPer;
		
	}

}
