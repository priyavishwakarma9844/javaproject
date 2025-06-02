package arrayList;

import java.util.ArrayList;

public class TestStudent {
	public static void main(String[] args) {
		
		Student s1= new Student(101, "Tom");
		Student s2= new Student(102, "Tim");
		Student s3= new Student(103, "Tommy");
		
		ArrayList<Student> l = new ArrayList();
		l.add(s1);	
		l.add(s2);	
		l.add(s3);	
		
		for(Student i : l) {
			System.out.println(i);
		}
		
		
		
	}

}
