package day2;

import java.util.Scanner;

public class BoardExams {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);						//A		   B
	System.out.println("Please enter your SSC percentage"); //90.15   65.0
	double sscPer=sc.nextDouble();
	
	System.out.println("Please enter your HSC percentage"); //87.15   75.0
	double hscPer=sc.nextDouble();
	
	double totalPer=sscPer+hscPer;
	
	System.out.println("Total Per : "+totalPer);
	double avgPer=totalPer/2;
	System.out.println("Average Per : "+avgPer);
	
	if(avgPer>=80.0)
	{
		System.out.println("Scholar Student");
	}
	else
	{
		System.out.println("Regular Student");
	}
	
	System.out.println("Thank you!!");
}
}
