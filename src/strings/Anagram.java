package strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="triangle";
		String s2="intregal";
		
		char[] charArrays1 = s1.toCharArray();
		char[] charArrays2 = s2.toCharArray();
		
		Arrays.sort(charArrays1);
		Arrays.sort(charArrays2);
		
		if (Arrays.equals(charArrays1, charArrays2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("not an anagram");
		}

	}

}
