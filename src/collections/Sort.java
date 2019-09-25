package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add("Gopal");
		al.add("Prashan");
		al.add("Shashi");
		al.add("Vikas");
		al.add("Belagavi");
		al.add("Bengaluru");
		
//		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);

		


	}

}
