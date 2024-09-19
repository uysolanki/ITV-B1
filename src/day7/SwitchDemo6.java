package day7;

import java.util.Scanner;

public class SwitchDemo6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Number 1");  
		double num1=sc.nextDouble();
		
		System.out.println("Please enter Number 2");  
		double num2=sc.nextDouble();
		
		System.out.println("Please enter Math Operator \n + \n - \n * \n \\");  
		char operator=sc.next().charAt(0);
		switch(operator)
		{
		case '+' : System.out.println(num1+num2); break;
		case '-' : System.out.println(num1-num2); break;
		case '*' : System.out.println(num1*num2); break;
		case '/' : System.out.println(num1/num2); break;
		
		default : System.out.println("Invalid Input"); break;
		}

	}

}
