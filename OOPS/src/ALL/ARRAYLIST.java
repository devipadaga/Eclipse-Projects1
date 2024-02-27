package ALL;

import java.util.ArrayList;

public class ARRAYLIST {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>(); 
	       al.add(12);
	       al.add(22);
	       al.add(32);
	       al.add(42);
	       System.out.println(al);
	       
	       //add
	       al.add(2, 31);
	       System.out.println(al);
	       
	       //remove
	       al.remove(2);
	       System.out.println(al);

	}

}
