package arrays;

import java.util.Arrays;

public class TwoEqualArrays {

	public static void main(String[] args) {
		int a[] = { 1, 2, 43, 54, 3, 48, 5 };
		int b[] = { 1, 2, 54, 43, 3, 48, 5 };
		
		Arrays.sort(a);
		Arrays.sort(b);
		
	boolean equals = Arrays.equals(a, b);
	
	System.out.println(equals);

	if (Arrays.equals(a,b)) {
		System.out.println("equal");
	}
		 
		
		
	}
	
}
