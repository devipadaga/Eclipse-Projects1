package client;

public class ReplaceDuplicateArrayWithZeros {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,4,3,1,3,6};
		int dup=0;
		
		for(int a1:a)
		{
			System.out.print(a1);
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					//System.out.println("print duplicates :"+a[j]);
					
					a[i]=dup;
					a[j]=dup;		
				}
			}
			
		}
		
		System.out.println("                                              ");
		
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]);
			}
			
		

	}

}
