package starpattern;

public class Triangle {

	public void leftIn() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}

	public void rightIn() {
		for (int i = 1; i <= 5; i++) {
			for (int k = 5; k >= i; k--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public void rightDe() {

		for (int i = 0; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	public void leftDe() {
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <=i; k++) {
				System.out.print("  ");
			}
			for (int j =5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Triangle obj = new Triangle();
		obj.leftIn();
		obj.rightIn();
		System.out.println("=======");
		obj.rightDe();
		System.out.println("=======");
		obj.leftDe();
	}
}
