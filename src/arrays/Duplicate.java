package arrays;


public class Duplicate {

	public static void main(String[] args) {
		int a[] = { 10, 2, 43, 54, 2, 43, 53, 67,53, 53, 10 };
		System.out.println("duplicte num:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.print(" "+a[i]);
				}
			}
		}
	}
}
