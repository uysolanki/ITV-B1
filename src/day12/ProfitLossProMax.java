package day12;

import java.util.Scanner;

public class ProfitLossProMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Cost Price");
		int cp=sc.nextInt();
		System.out.println("Enter the Selling Price");
		int sp=sc.nextInt();
		
		business(cp,sp);

	}

	private static void business(int cp, int sp) {
		if(sp>cp)
		{
					calculatePL(cp,sp);
					
		}
		else if(sp<cp)
		{		
					int lossAmount=cp-sp;		
					double lossPer = (lossAmount * 100) / cp;
					System.out.println("Loss Occured");
					System.out.println("Loss Amount "+lossAmount);
					System.out.println("Loss Percentage "+lossPer);
		}
		else
		{
			System.out.println("No P No L");
		}
		
	}

	private static void calculatePL(int cp, int sp) {
		int profitAmount=sp-cp;		
		double profitPer = (profitAmount * 100) / cp;
		System.out.println("Profit Gained");
		System.out.println("Profit Amount "+profitAmount);
		System.out.println("Profit Percentage "+profitPer);
		
	}

}
