package day12;

import java.util.Scanner;

public class ProfitLossProMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Cost Price");
		int cp=sc.nextInt();
		System.out.println("Enter the Selling Price");
		int sp=sc.nextInt();
		
		calculatePL(cp,sp);

	}



	private static void calculatePL(int cp, int sp) {
		int plAmount=Math.abs(sp-cp);		
		double plPer = (plAmount * 100) / cp;
		if(sp>cp)
		{
		System.out.println("Profit Gained");
		System.out.println("Profit Amount "+plAmount);
		System.out.println("Profit Percentage "+plPer);
		}
		else
		{
		System.out.println("Loss Occured");
		System.out.println("Loss Amount "+plAmount);
		System.out.println("Loss Percentage "+plPer);	
		}
		
	}

}
