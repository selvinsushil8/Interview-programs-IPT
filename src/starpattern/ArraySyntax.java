package starpattern;

import java.util.Iterator;

public class ArraySyntax {

	public static void main(String[] args) {

		int a[]=new int[6];
		a[0]=155;
		a[1]=25;
		a[2]=17;
		
		System.out.println(a[2]);
		
		
		int b[]= {1,2,4,44,67};
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("========");
		int c[][]= {{1,3},{2,6}};
		System.out.println(c[1][1]);
		
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("");
			}
			
			for (int j = 1; j <=i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}

}
