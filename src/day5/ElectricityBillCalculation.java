/*
 write a java program that accept number of electricity
Units consumed and calculate electricity bill from following data.
● For first 50 units – Rs. 3.50/unit
● For next 100 units – Rs. 4.00/unit
● For next 100 units – Rs. 5.20/unit
● For units above 250 – Rs. 6.50/unit

Fixed meter and service charge- Rs. 150/-
 */
package day5;

import java.util.Scanner;

public class ElectricityBillCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Meter Units");  //125
		int units=sc.nextInt(); 
		double totalAmount=0;
		
		if(units<=50)
		{
			totalAmount=units*3.5;
		}
		else if(units<=150)
		{
			totalAmount=50*3.5 + (units-50)*4;
		}
		else if(units<=250)
		{
			totalAmount=50*3.5 + 100*4 +(units-150)*5.2;
		}
		else
		{
			totalAmount=50*3.5 + 100*4 + 100*5.2 +(units-250)*6.5;
		}
		
		totalAmount=totalAmount+150;
		
		System.out.println("Total Bill is "+ totalAmount);
	}

}
