package client;

public class AscendingOrderArray {

	public static void main(String[] args) {
		
		int[] a=new int[] {1,9,2,8,3,7,4,6,5};
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		System.out.println("                           ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}

	}

}
