package strings;

public class Length {

	public static void main(String[] args) {

		String s="HEllo world this is java";
		
		String[] words = s.split(" ");
		System.out.println("No. of words");
		System.out.println(words.length);
		
		System.out.println("HEllo world this is java");
		for(String charc:words) {
			int length = charc.length();
			System.out.print(length+"     ");
		}
		
	}

}
