package day10;

import java.util.Scanner;

public class FunctionScenerio1ElectricBill {

	public static void main(String[] args) {
		ebc();
	}

	private static void ebc() {
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
