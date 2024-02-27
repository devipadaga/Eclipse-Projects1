package Codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MisssingNumInArray {

	public static void main(String[] args) {
		
		List<Integer>l=new ArrayList<>();
		
		for(int i=1;i<=30;i++)
		{
			l.add(i);
		}
		Collections.shuffle(l);
		System.out.println("Removed num is+ "+l.remove(0));
		
		Integer[] arr=new Integer[l.size()];
		l.toArray(arr);
		
		System.out.println("Missing number :"+MissingNum(arr));
	}
	
	
	
	private static int MissingNum(Integer[] input)
	{
		int totalArrSum=0;
		for(int i:input)
		{
			totalArrSum+=i;
			
		}
		
		System.out.println("sum of Array is: "+totalArrSum);
		
		int inputSize=input.length+1;
		
		int sumofNNum=inputSize*(inputSize+1)/2;
		
		return sumofNNum-totalArrSum;
	}

}
