package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateList {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(25);
		l1.add(25);
		l1.add(31);
		l1.add(26);
		
//		Set<Integer>s1=new HashSet<Integer>(l1);
//		System.out.println(s1);
		
		Set<Integer>s1=new TreeSet<Integer>();
		for (Integer nl : l1) {
			s1.add(nl);
		}
		System.out.println(s1);
	}

}
