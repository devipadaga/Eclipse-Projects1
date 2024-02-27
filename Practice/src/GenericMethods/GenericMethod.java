package GenericMethods;

public class GenericMethod {
	
	public <T> void printArray(T[] arr)
	{
		System.out.println("Using ForLoop");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println(" ");
		
		System.out.println("using foreach loop");
		for(T element:arr)
		{
			System.out.print(element);
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		
		GenericMethod gm=new GenericMethod();
		
		Integer[] intarr= {1,2,3,4,5,6};
		String[] Sarr= {"ss","dd","dede","ede","ded"};
		gm.printArray(intarr);
		gm.printArray(Sarr);

	}

}
