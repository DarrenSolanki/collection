package collections;

import java.util.HashMap;

public class HashMapP {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		hm.put(2, "Hello");
		hm.put(5, 'C');
		hm.put(7, 20);
		hm.put(2, "Hi");
		hm.put("hi", "Hi");
		System.out.println(hm.size());
		//Not recomend to for loop, for each loop or iterator(I)
		
		System.out.println(hm);

		
		
	}

}
