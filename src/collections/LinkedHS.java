package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHS {

	public static void main(String[] args) {

		LinkedHashSet ls = new LinkedHashSet();
		ls.add("Hi");
		ls.add(10);
		ls.add(null);
		ls.add(29.4);
		ls.add(false);
		
		Iterator itr = ls.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		
	}

}
