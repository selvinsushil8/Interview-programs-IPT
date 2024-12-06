package strings;

public class Vowels {

	public static void main(String[] args) {
			String s= "JAva is my world selenium";
			String ls = s.toLowerCase();

			int count =0;
			for (int i = 0; i<ls.length(); i++) {
				if (ls.charAt(i)=='a'||ls.charAt(i)=='e'){
					count++;
					System.out.print(ls.charAt(i));
				}
				
			}

			System.out.println(count);
	}

}
