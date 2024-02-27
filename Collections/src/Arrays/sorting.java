package Arrays;

public class sorting {

	public static void main(String[] args) {
		
		int arr[] = {50, 25, 30, 55, 15};
		int temp=0;
		for (int i : arr) 
		{
			System.out.print(i+" ");
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
				
			}
			
			System.out.print("\n"+arr[i]+" ");
		}
		
		

	}

}
