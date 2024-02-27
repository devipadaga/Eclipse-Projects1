package Three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MostOcurranceCharacter {

	public static void main(String[] args) {
		
//      int arr[]= {'A', B', 'C', 'D', 'E', 'A','A', 'C', 'C', 'E', 'B',};

//      count of charecter  A =3,B=2,C=3,D=1,E=2  
         // most no of count char A,C
      //output should be = A;
		
//		char[] arr= {'A','B','C', 'D', 'E', 'A','A', 'C', 'C', 'E', 'B',};
//		int position=1;
//		List<Character>list=new ArrayList<>();
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			int count=0;
//			for(int j=0;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					count++;
//				}
//			}
//			if(!list.contains(arr[i]))
//			{
//				list.add(arr[i]);
//				if(count>2)
//				System.out.print(arr[i]+"="+count);
//				
//			}
//		}
//		
		
//		char[] arr= {'A','B','C','B', 'D', 'E', 'A','A', 'C', 'C', 'E', 'B',};
//		int max=0;
//        int count=1;
//        char a='-';
//		int n=arr.length;
//		System.out.println("Length of array is : "+n);
//		for(int i=1;i<=n;i++)
//        {
//			if((i==n)||(arr[i]!=arr[i-1]))
//            {
//                if(max<count)
//                {
//                    max=count;
//                    a=arr[i-1];
//                }
//                count=1;
//            }
//            else
//            {
//                count++;
//            }           
//        }
//        System.out.println(a);
		
		
		char[] arr = { 'A', 'B', 'C', 'D', 'E', 'A', 'A', 'C', 'C', 'E', 'B', 'B' };
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c : arr) {

            if (map.containsKey(c)) {

                map.put(c, map.get(c) + 1);
            } else
                map.put(c, 1);

        }
        System.out.println(map);

        Integer maxNum = 0;
        for (Object a : map.keySet()) {
            if ((int) map.get(a) > maxNum) {
                maxNum = (int) map.get(a);

            }
        }

        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (maxNum.equals(entry.getValue())) {
                System.out.println(entry.getKey());
                break;
            }
        }
	}
}
