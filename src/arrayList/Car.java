package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Car {
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		System.out.println(l);
		
		LinkedList<Integer> ll = new LinkedList();
		l.add(30);
		l.add(40);
		
		ll.addAll(l);
		System.out.println(ll);
		
		
		
	}

}
