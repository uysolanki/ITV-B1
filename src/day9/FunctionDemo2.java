package day9;

public class FunctionDemo2 {

	public static void main(String[] args) {
		System.out.println("I am in Main");
		brazil();
		System.out.println("I am finally back in Main");
	}

	private static void brazil() {
		System.out.println("I am in Brazil");
		argentina();
		france();
		System.out.println("I am back in Brazil");
	}

	//function defination aka function body
	private static void france() {
		System.out.println("I am in France");
	}

	private static void argentina() {
		System.out.println("I am in Argentina");

	}
	
}
