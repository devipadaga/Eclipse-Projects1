package exercise1GivenByGurusir;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QustionNo1 {

	public static void main(String[] args) {



		Set<String> firstname=new HashSet<>();
		Set<String> lastname=new HashSet<>();

		Set<String> duplicatenames=new HashSet<>();

		Map<String, String> personname=new HashMap<>();

		firstname.addAll(Arrays.asList("Tirumala","Vasanth","Jayesh","Yashmant","Srikar"));

		lastname.addAll(Arrays.asList("Kadiyam","Kumar","Jayesh","Gouda","Srikar"));

		for(String str1 : firstname) {

			for(String str2 : lastname) {

				if(str1.equals(str2)) {
					//duplicatenames.add(str1);
					personname.put(str1, str2);
					break;
				}
			}
		}

		for(Entry<String,String> set : personname.entrySet())
		{
			System.out.println("firstname  : "+set.getKey() + " lastname : " +set.getValue());
		}
	}

}
