package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedOccurrence {

	public static void main(String[] args) {

		String s = "java is not not a program but  but also coding language which is also program";

		String replace = s.replace("  ", " ");
		String[] s1 = replace.split(" ");

		Map<String, Integer> m1 = new HashMap<String, Integer>();

		for (String w : s1) {
			if (m1.containsKey(w)) {
				m1.put(w, m1.get(w) + 1);

			} else {
				m1.put(w, 1);
			}
		}

		System.out.println(m1);
		Integer integer = m1.get("program");
		System.out.println(integer);

		Set<Entry<String, Integer>> entry = m1.entrySet();
		System.out.println(entry);

		for (Entry<String, Integer> v : entry) {

			if (v.getValue() > 1) {
				System.out.println(v.getKey() + v.getValue());
			}
		}

	}

}
