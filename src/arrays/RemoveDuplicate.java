package arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int d[] = { 10, 2, 43, 54, 2, 43, 5 };

		int dup = -1;

		for (int i = 0; i < d.length; i++) {
			if (d[i] != -1) {
				for (int j = i + 1; j < d.length; j++) {
					if (d[i] == d[j]) {
						d[j] = dup;
					}
				}
				System.out.print(" " + d[i]);

			}

		}

	}
}
