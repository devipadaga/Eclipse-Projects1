package BasicPrograms;

public class LargestNumInArray {

	public static void main(String[] args) {
		
		int a[] = {10,5,20,30,99,45,67,87,96,150};
		int largest=a[0];
		int smallest=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			else if(a[i]<smallest)
			{
				smallest=a[i];
			}
			
		}
		System.out.println(largest+" is largest number");
		System.out.println(smallest+" is smallest number");

	}

}
