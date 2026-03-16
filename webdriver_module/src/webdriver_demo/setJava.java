package webdriver_demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setJava {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();

		System.out.println("size of set " + s.size());

		s.add("London");
		s.add("India");
		s.add("USA");
		s.add("India");
		s.add("Germany");
		s.add("India");

		System.out.println("size of set " + s.size());

		Iterator<String> it = s.iterator();
		// hasNext(); - boolean , next() - string

//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		

	}

}
