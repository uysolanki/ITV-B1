package day7;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		System.out.println("1. English");
		System.out.println("2. Hindi");
		System.out.println("3. Marathi");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Your choice");  
		int choice=sc.nextInt(); 
		
		switch(choice)
		{
		case 1 : System.out.println("Call routed to London"); break;
		case 2 : System.out.println("Call routed to Delhi"); break;
		case 3 : System.out.println("Call routed to Pune"); break;
		default : System.out.println("Invalid Input");
		}
				
		System.out.println("Thank You!, Visit Again");


	}

}
