package arrays;

public class PairOfTarget {

	public static void main(String[] args) {

		int a[] = { 6, 2, 1, 5, 3, 7, 5 };
		int sum = 8;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == sum) {
					System.out.println("{" + a[i] + "," + a[j] + "}");
				}
			}
		}

	}

}
