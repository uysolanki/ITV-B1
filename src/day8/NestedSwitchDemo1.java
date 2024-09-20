package day8;

import java.util.Scanner;

public class NestedSwitchDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("1. English");
		System.out.println("2. Arabic");
		System.out.println("0. Exit");
		System.out.println("Enter Choice : ");
		choice=sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("1. UK");
			System.out.println("2. US");
			System.out.println("3. AUS");
			System.out.println("0. Exit");
			System.out.println("Enter Choice : ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1 : System.out.println("Call Routed to London");break;
			case 2 : System.out.println("Call Routed to New York");break;
			case 3 : System.out.println("Call Routed to Sydney");break;
			case 0 :System.exit(0);
			default : System.out.println("Invalid Input");break;
			}
			
		break;
		case 2:
			System.out.println("1. Qatar");
			System.out.println("2. Oman");
			System.out.println("3. Dubai");
			System.out.println("0. Exit");
			System.out.println("Enter Choice : ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1 : System.out.println("Call Routed to Doha");break;
			case 2 : System.out.println("Call Routed to Muscat");break;
			case 3 : System.out.println("Call Routed to Abu Dhabi");break;
			case 0 :System.exit(0);
			default : System.out.println("Invalid Input");break;
			}
		break;
		case 0:
			System.exit(0);
		break;
		default:System.out.println("Invalid input");
			break;
		}
	}

}
