package strings;

public class StringBasic {
	public static void main(String[] args) {
		
		String s="   hello madam7823%&^^6";
		String a="please";
		System.out.println(s.length());
		int codePointAt = s.codePointAt(2);
		System.out.println(codePointAt);
		
		String concat = s.concat(a);
		System.out.println(concat);
		
		boolean contains = s.contains(a);
		
		boolean contentEquals = s.contentEquals(a);
		System.out.println(contentEquals);
		
		int indexOf = s.indexOf("a");
		System.out.println(indexOf);
		
		System.out.println("trim");
		String trim = s.trim();
		System.out.println(trim);
		
		String[] split = s.split("");
		for (String spl : split) {
			System.out.println(spl);
		}

		int lastIndexOf = s.lastIndexOf("a");
		System.out.println(lastIndexOf);
		
		boolean startsWith = s.startsWith("hel");
		System.out.println(startsWith);
		
		char charAt = s.charAt(2);
		System.out.println(charAt);
		
		String replace = s.replace("hello", "hi");
		System.out.println(replace);
		
		String substring = s.substring(3);
		System.out.println(substring);
		
		String substring2 = s.substring(2, 9);
		System.out.println(substring2);
		
		StringBuffer sb=new StringBuffer("java");
		String sim="java";
		String sim2="java";
		
		System.out.println("===================");
		System.out.println(sim.equals(sim2));
		
		String replaceAll = s.replaceAll("^[a-zA-Z0-9]", s);
		System.out.println(replaceAll);
		
	}
}
