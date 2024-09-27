package day13;

public class CallByValue {

	public static void main(String[] args) {
		int a=10;
		System.out.println("A : "+a);
		test(a);					    //a is Actual Parameter
		System.out.println("A : "+a);
	}

	private static void test(int z) 	//z is Formal Parameter
	{
		System.out.println("Z : "+z);
		z=99;
		System.out.println("Z : "+z);
	}

}
