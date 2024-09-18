package day6;

import java.util.Scanner;

public class SalaryCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Annual Package");  
		double myPackage=sc.nextDouble(); 
		double monthlySalary=0;
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
		
		
		System.out.println("Annual Package" +myPackage);
		double nonTaxableMonthlySalary=myPackage/12;
		
		System.out.println("Monthly Income in a non taxable country "+nonTaxableMonthlySalary);
		
		double monthlyTaxAmount=annualTaxAmount/12;
		System.out.println("Monthly Tax Amount "+monthlyTaxAmount);
		
		monthlySalary=nonTaxableMonthlySalary-monthlyTaxAmount;
		
		System.out.println("Monthly Income in a Taxable country "+ monthlySalary);
	}
}
