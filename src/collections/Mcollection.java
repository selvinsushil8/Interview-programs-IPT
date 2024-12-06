package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mcollection {

	public static void main(String[] args) {

		Map<Object, Object> m1=new HashMap<Object, Object>();
		m1.put("selvin", 25);
		m1.put("sushil", 5);
		m1.put("kumar", 27);
		m1.put("kumar", 28);
		System.out.println(m1);
		Set<Entry<Object, Object>> entrySet = m1.entrySet();
		System.out.println(entrySet);
		Set<Object> keySet = m1.keySet();
		System.out.println(keySet);
		Collection<Object> values = m1.values();
		System.out.println(values);
		boolean containsKey = m1.containsKey("selvin");
		System.out.println(containsKey);
		Object object = m1.get(values);	
		System.out.println(object);
		Object object2 = m1.get("selvin");
		System.out.println(object2);
	}
		
}
