package collections;

import java.util.LinkedHashMap;

public class LinkedHashMapP {

	public static void main(String[] args) {

		LinkedHashMap lh = new LinkedHashMap();
		lh.put(10, "Jai Hind");
		lh.put(2, "Hello");
		lh.put(5, 'C');
		lh.put(7, 20);
		lh.put(2, "Hi");
		System.out.println(lh.size());
		
		System.out.println(lh);

	}

}
