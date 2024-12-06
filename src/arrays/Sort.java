package arrays;

public class Sort {
	public static void main(String[] args) {

		int a[] = { 10, 2, 43, 54, 2, 43, 53, 67, 53, 53, 10 };
		int temp=0;

		System.out.println("original array:");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[j]<a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.print(a[i]+" ");
		}
		
	
		
		
		
	}

}
