package arrays;

public class EvenOdd {
	public static void main(String[] args) {
		
		int a[] = { 1, 2, 43, 54, 3, 48, 5 };
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				System.out.println("Even num are :"+a[i]);
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2!=0) {
				System.out.println("Odd num are :"+a[i]);
			}
		}
		
	}

}
