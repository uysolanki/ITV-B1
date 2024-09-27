package day13;

public class CallByReference {
public static void main(String[] args) {
											//0			1			2			
	int arr[]= {10,20,30};					//10		20			30
	System.out.println("first value "+arr[0]);
	test(arr);
	System.out.println("first value "+arr[0]);
}

private static void test(int[] brr) {
	System.out.println("first value "+brr[0]);
	brr[0]=99;
	System.out.println("first value "+brr[0]);
}
}
