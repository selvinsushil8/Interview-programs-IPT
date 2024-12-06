package strings;

import java.util.*;

public class RemoveSplCharc {

	public static void main(String[] args) {
		String s = "Thangalaan^%&(* is *^&*&*8^*^&*H78676473 goOOd movie";
		

		String replace = s.replace("^", "");
		System.out.println(replace);
		
		String replaceAll = replace.replaceAll("[^a-zA-z0-9 ]", "");
		System.out.println(replaceAll);
		
		
	}

}
