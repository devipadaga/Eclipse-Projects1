package Three;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		ts.add("A");
		ts.add("D");
		ts.add("Z");
		ts.add("L");
		ts.add("a");
		//ts.add(new Integer(10));
		//ts.add(null);
		
		System.out.println(ts.add("Z"));
		System.out.println(ts);
		

	}

}
