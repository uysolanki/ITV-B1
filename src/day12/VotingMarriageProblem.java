package day12;

import java.util.Scanner;

public class VotingMarriageProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=sc.nextInt();
		vote(age);
		dl(age);
	}

	private static void dl(int age) {
	if(isAdult(age))
		System.out.println("Eligible for License");
	else
		System.out.println("Not Eligible for License");
		
	}

	private static void vote(int age) {
	if(isAdult(age))
		System.out.println("Eligible for Voting");
	else
		System.out.println("Not Eligible for Voting");	
	}

	public static boolean isAdult(int age)
	{
		if (age>=21)
			return true;
		else
			return false;
	}
	
}
