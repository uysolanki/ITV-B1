package day7;

import java.util.Scanner;

public class SwitchDemo5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	System.out.println("Please enter a vowel char");   //a e i o u
//	char vowel=sc.next().charAt(0); 		//"a"   'a'
//	switch(vowel)
//	{
//	case 'A' :
//	case 'a' : System.out.println("Amitabh"); break;
//	case 'E' :
//	case 'e' : System.out.println("Engine"); break;
//	case 'I' :
//	case 'i' : System.out.println("India"); break;
//	case 'O' :
//	case 'o' : System.out.println("Orange"); break;
//	case 'U' :
//	case 'u' : System.out.println("Umbrela"); break;
//	default : System.out.println("Invalid Input"); break;
//	}
	
	
	System.out.println("Please enter a vowel char");   //a e i o u
	char vowel=sc.next().toLowerCase().charAt(0); 		//"a"   'a'
	switch(vowel)
	{
	case 'a' : System.out.println("Amitabh"); break;
	case 'e' : System.out.println("Engine"); break;
	case 'i' : System.out.println("India"); break;
	case 'o' : System.out.println("Orange"); break;
	case 'u' : System.out.println("Umbrela"); break;
	default : System.out.println("Invalid Input"); break;
	}
}
}
