package collections;

import java.util.HashSet;

public class HashSetP {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("Hello");
		hs.add('c');
		hs.add(true);
		hs.add(null);
		hs.add(true);
		hs.add(10);
		
//		System.out.println(hs);
		//Cant use normal for loop for Hashset
		
		for(Object a1 : hs) {
			System.out.println(a1);
		}
		
	}

}
