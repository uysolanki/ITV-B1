package day7;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("1. English");
		System.out.println("2. Hindi");
		System.out.println("3. Marathi");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Your choice");  
		int choice=sc.nextInt(); 
		if(choice==1)
		{
			System.out.println("Call routed to London");
		}
		else if(choice==2)
		{
			System.out.println("Call routed to Delhi");
		}
		else if(choice==3)
		{
			System.out.println("Call routed to Pune");
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
		
		System.out.println("Thank You!, Visit Again");

	}

}
