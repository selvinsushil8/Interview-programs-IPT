package strings;

public class CountOfCharc {

	public static void main(String[] args) {

		String s="HEllo world this is java";
		
		int count=0;
		
		
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("no. of i :"+count);
		
		String replace = s.replace(" ","");
		String[] split = replace.split("");
		int length = split.length;
		System.out.println(length);
		}

}
