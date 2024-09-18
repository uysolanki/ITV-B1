package day6;

import java.util.Scanner;

public class SalaryCalculation2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Annual Package");  
		double myPackage=sc.nextDouble(); 
		double annualTaxAmount=0;
		
		if(myPackage<=750000)			
		{
			annualTaxAmount=0;
		}
		else if(myPackage<=1000000)
		{
			annualTaxAmount=(myPackage-750000)*.10;
		}
		else if(myPackage<=1500000)
		{
			annualTaxAmount=(250000)*.10 + (myPackage-1000000)*.20;
		}
		else
		{
			annualTaxAmount=(250000)*.10 + (500000)*.20 +  (myPackage-1500000)*.30;
		}
		System.out.println("Annual Tax Amount" +annualTaxAmount);
		
		double annualInHandIncome=myPackage-annualTaxAmount;
		System.out.println("Monthly Income in a Taxable country "+ (annualInHandIncome/12));
	}
}
