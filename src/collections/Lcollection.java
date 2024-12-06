package collections;

import java.util.*;

public class Lcollection {
	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		l1.add(10);
		l1.add(25);
		l1.add(25);
		l1.add(31);
		l1.add(26);
		l2.add(1);
		l2.add(25);
		l2.add(5);
		l2.add(31);
		l2.add(26);
		
		
		System.out.println(l1);
		
		l1.remove(2);
		System.out.println(l1);
		l1.retainAll(l2);
		System.out.println(l1);
		int size = l1.size();
		System.out.println(size);
		
		boolean contains = l1.contains(l2);
		System.out.println(contains);
		
	}

}
