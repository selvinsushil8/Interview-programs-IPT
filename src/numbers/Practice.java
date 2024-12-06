package numbers;

import java.util.LinkedHashSet;
import java.util.Set;

public class Practice {
	public static void main(String arg[]) {

		int num = 11;
		int count = 0;

		for (int i = 1; i<= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime");

		} else {
			System.out.println("not prime");
		}

		
		for (int i = 1; i <=5; i++) {
			
			for (int j = 5; j >i; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		StringBuilder sb=new StringBuilder("my world java");
		System.out.println(sb.reverse());
		
		Set<Object> s1=new LinkedHashSet<Object>();
		
}
}
