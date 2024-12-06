package collections;

import java.util.HashMap;
import java.util.Map;

public class Vowels {

	public static void main(String[] args) {
		String s="java worlde java";
		
		
		Map<Character, Integer> m1=new HashMap<Character, Integer>();
		
		m1.put('a', 0);
		m1.put('e', 0);
		m1.put('i', 0);
		m1.put('o', 0);
		m1.put('u', 0);
		
		for (char w : s.toCharArray()) {
			if(m1.containsKey(w)) {
				m1.put(w, m1.get(w)+1);
			}
		}
		System.out.println(m1);
	}

}
