package day4;

import java.util.Scanner;

public class ConditionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age");
		int myAge=sc.nextInt();
		
		if(myAge>=18)							//is 13>=18 False
		{
			System.out.print("Adult"+"\n");
		}
		
		System.out.println("Thank You!!");

	}

}
