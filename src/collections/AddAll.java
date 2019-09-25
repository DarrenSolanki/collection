package collections;

import java.util.ArrayList;

public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);


		ArrayList a2 = new ArrayList();
		a2.add(40);
		a2.add(20);
		a2.add(35);
		System.out.println(a1);
		a1.addAll(2, a2);
		// Add all array elements to 
		System.out.println(a1.addAll(a2));
		System.out.println(a1);
		//removeAll : to remove all duplicate values 
		//retainAll : to retain all duplicate values
		/*
		 * a1.addAll(1, a2); System.out.println(a1);
		 */
		
//		a1.removeAll(a2);
//		System.out.println(a1);
//		a1.retainAll(a2);
//		System.out.println(a1);
		


	}

}
