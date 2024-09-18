package day4;

import java.util.Scanner;

public class AcceptCharDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter gender male/female");
		String gender=sc.next();								//        012345
		char gen=gender.charAt(0)	;					//gender="Vedant"
		if(gen=='m')								    //g='m'
		{
			System.out.println("Mr.");
		}
		else
		{
			System.out.println("Ms.");
		}
		
//		System.out.println("Please enter name");
//		char h=sc.next().charAt(0);								//        0
//		System.out.println(h);
	}
//	

}
