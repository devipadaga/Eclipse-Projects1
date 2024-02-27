package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList();
		
		l.add("SOWMYA");
		l.add("Arun");
		
		Collections.addAll(l,"devi","kumar","ag");
		
		System.out.println("The Elements Are:"+l);
		l.add(1, "bangaram");
		System.out.println("The Elements Are:"+l);
		
		
		
		Collections.sort(l,Collections.reverseOrder());
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println("Reverse Order:"+l.get(i)+" ");
		}
		
		//Collections.sort(l,Collections.reverseOrder());
 
		//PRINTING ONE ELEMENT EACH//
		for(int i=0;i<l.size();i++)
		{
			System.out.println("Each element:"+l.get(i)+"");
		}
		
		//******BINARY SEARCH**********//
		
		System.out.println("Index of arun is=="+Collections.binarySearch(l,"Arun"));
		
		System.out.println("                                                       ");
		//*******COPYING OF THE ELEMENTE********************//
		
		List<String> dl=new ArrayList();
		dl.add("bhavani");
		dl.add("Pranu");
		dl.add("chitti");
		
		for(int i=0;i<dl.size();i++)
		{
			System.out.println("dl elements:"+dl.get(i));
		}
		
		List<String> sl=new ArrayList();
		sl.add("potti");
		sl.add("chinnu");
		
		System.out.println("source elemente:"+sl);
		
		Collections.copy(dl,sl );
		
		System.out.println("Elements after copying is:"+dl);
		/*for(int i=0;i<dl.size();i++)
		{
			System.out.println(dl.get(i));
			
		}*/
	
	//*************Disjoint*********************//
	System.out.println("                        ");
	System.out.println(Collections.disjoint(dl,sl));
	
	}
	
	
	

}
