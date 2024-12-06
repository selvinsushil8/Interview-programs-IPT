package arrays;

public class Reverse {

	public static void main(String[] args) {
		int n=567;
		int rev=0;
		int lastdigit=0;
		
		while(n!=0) {
			
			lastdigit=n%10;
			rev=(rev*10)+lastdigit;
			n=n/10;
			
//			System.out.println(rev);
//			System.out.println(n);
//			System.out.println(lastdigit);
		}
		 
		System.out.println(rev);
	}
	
	
}
