package collections;

import java.util.ArrayList;

public class ArrayListP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add('C');
		al.add("Hi");
		al.add(null);
		al.add(10);
		al.add(0, 20); //to add value @ particular index
		al.set(0, "Hello"); //to replace the value
		al.remove(0); // to remove particular element
		al.clear(); // to remove all elements
		
//		for(int i =0; i<al.size(); i++) {
//			
//			System.out.println(al.get(i));
//		}
		
		for(Object a1 : al) {
			System.out.println(a1);	
		}
		
		System.out.println(al);	


	}

}
