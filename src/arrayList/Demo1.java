package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo1 {
	public static void main(String[] args) {
		
//		LinkedList<Integer> l = new LinkedList();
//		l.add(20);
//		l.add(30);
//		l.add(5);
//		System.out.println(l);
//		
//		for(int i=0; i<l.size();i++) {
//			System.out.println(l.get(i));
//		}
//		
//		for(int i : l) {
//			System.out.println(i);
//		}
		
		int a = 20;
		char b = 'z';
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(a);
		l.add(b);
		
		for(Object i : l) {
			System.out.println(i);
		}
		
		
		
		
		
	}

}
