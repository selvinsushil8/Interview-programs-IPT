package strings;

public class ReverseWords {

	public static void main(String[] args) {

		String s="Selvin Sushil Kumar";
		String rev="";
		
		String[] s1 = s.split(" ");
		
		
			for (int i = s1.length-1; i >=0; i--) {
				rev=rev+s1[i]+" ";
			}
		
		System.out.println(rev);
	}

}
