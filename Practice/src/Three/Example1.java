package Three;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		
		//input==>String str="ABCd23#$egd*45&";
		//output= {ABC,degd,2345,#$*&};

		
		
		String str="ABCd23#$egd*45&";
		System.out.println("Input is :"+str);
		
	        String upper = "";
	        String lower = "";
	        String num = "";
	        String spe = "";
	        ArrayList<String> result = new ArrayList<String>();

	        for (int i = 0; i < str.length(); i++) {
	            Character c=str.charAt(i);
	            if(Character.isUpperCase(c))
	                 upper+=c;
	            else if(Character.isLowerCase(c))
	                lower+=c;
	            else if(Character.isDigit(c))
	                num+=c;
	            else
	                spe+=c;	            
	        }
	        result.add(upper);
	        result.add(lower);
	        result.add(num);
	        result.add(spe);
	       
	        System.out.println(result);
	        
	        //   USING ARRAY
// 			String[] arr = new String[4];
//	        arr[0]=upper;arr[1]=lower;arr[2]=num;arr[3]=spe;
//	        for(int i=0;i<arr.length;i++)
//	        {
//	            System.out.print(arr[i]+",");
//	        }
//	
	
	}

}
