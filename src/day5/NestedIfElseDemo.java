package day5;

import java.util.Scanner;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter HSC percentage");
		double hscPer=sc.nextDouble();  //for FC students find the avg of P&C
		if(hscPer>=70)
		{
		System.out.println("DIST");
		System.out.println("Please enter Physcis Marks");
		double phyMarks=sc.nextDouble();
		System.out.println("Please enter Chem Marks");
		double chemMarks=sc.nextDouble();
		double avgPhyChem=(phyMarks+chemMarks)/2;
		System.out.println("Average of Phy & Chem Marks is "+avgPhyChem);
		}
			else if(hscPer>=60)
			{
			System.out.println("FC");		//average of languages Eng Hindi Marathi
			}
				else if(hscPer>=50)
				{
				System.out.println("SC");
				}
					else if(hscPer>=35)
					{
					System.out.println("PC");
					}
						else
						{
						System.out.println("Not Pass");
						}
						
		System.out.println("All the Best");
	
	}

}
