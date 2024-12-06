package starpattern;

public class Diamond {
	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("* ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("  ");
			}
				for (int j = 5; j >=i; j--) {
					System.out.print("* ");
				}
				for (int z = 5; z >i; z--) {
					System.out.print("* ");
				}
			

			System.out.println();
		}
		}
	}


