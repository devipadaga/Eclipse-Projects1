package Three;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIntegr extends ArrayList<Integer>{

	public static void main(String[] args) {
		
		
		
		List<Integer> list=new ArrayList<>(Arrays.asList(1, 2, 8, 3, 2, 2, 2, 5, 1));
		System.out.println("List before deletion :"+list);
		list.subList(2, 4).clear();
		System.out.println("List after deletion :"+list);
		
		
		
        //  USING IF CONDITION
        
//		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
//       for(int i=0;i<arr.length;i++)
//       {
//    	   if(arr[i]>3)
//    	   {
//    		   list.add(arr[i]);
//    	   }
//    	  
//       }
		
		
		
		// USING VALUE PROCESS
		
//			int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};		
//			int j=0;
//	        for(int i=0;i<arr.length;i++){
//	        	
//	            if(arr[i]==5){
//	               j=i;
//	               break;
//	            }
//	            System.out.println(arr[i]);
//	        }
//	        
	 
	        
 
      
       
       
	}

}
