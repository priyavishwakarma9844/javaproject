package arrayList;

import java.util.ArrayList;

public class Demo {
	
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(null);
		l.add(50);
		l.add(20);
		l.add("Java");
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		
		System.out.println(l.isEmpty());
		System.out.println(l.contains(200));
		
		
		
	}

}
