package numbers;

import java.util.HashMap;
import java.util.Map;

public class SwapNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
//		
//		a=a+b; //30
//		b=a-b; //10
//		a=a-b; //20
//		
//		
//		System.out.println(a+" "+b);
//		
		int count=0;
		
		int p[]= {11,26,89,21,23};
		int length = p.length;
		Map<Object, Object> m1=new HashMap<Object, Object>();
		
		for (int i = 1; i <=length; i++) {
			if(length % i== 0) {
				m1.put(i, m1.get(i));
			}
		}
		System.out.println(m1);
	}
}
