package strings;

public class Palindrome {

	public static void main(String[] args) {

		String s = "Madam";
		String s1 = s.toLowerCase();

		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}

		if (s1.equals(rev)) {
			System.out.println("Palidrome");
		} else {
			System.out.println("not a palidrome");
		}
		
		
	}

}
