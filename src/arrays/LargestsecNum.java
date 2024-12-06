package arrays;

import java.util.*;

public class LargestsecNum {

	public static void main(String[] args) {
		int a[] = { 1, 2, 43, 54, 3, 48, 5 };
		int temp = 0;
		int n = a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + " ");
		}
		System.out.println("2nd largest num:" + a[n - 1]);
	}
}
