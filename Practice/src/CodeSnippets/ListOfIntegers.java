package CodeSnippets;

import java.util.ArrayList;
import java.util.List;

//CHEK LIST OF INETGERS CONTAINS ONLY ODD NUMBERS

public class ListOfIntegers {

	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(4);
		al.add(3);
	
		System.out.println(checkNum(al));

	}
	
	
	public static Boolean checkNum(List<Integer> list) {
		
		for(int i:list) {
			if(i%2==0)
				return false;
		}
		
		return true;
		
		
	}

}


