package Codes;

public class ElementCheckINArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7};
		
		boolean test=false;
		
		int elementtocheck=7;
		
		for(int element:arr)
		{
			if(element==elementtocheck)
			{
				test=true;
				break;
			}
		}
		System.out.println("is "+elementtocheck+" present in the array ::"+test);
	}

}
