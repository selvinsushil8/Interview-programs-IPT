package strings;

public class ReverseWordsFullStop {

	public static void main(String[] args) {

		String s="i.live.in.the.world";
		
		String[] split = s.split("\\.");
		String rev="";
		
		for (int i = split.length-1; i >=0; i--) {
			
			rev=rev.concat(".").concat(split[i]);
		}
		System.out.println(rev);
	}
}
