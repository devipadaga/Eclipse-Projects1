package Codes;

public class Pattern {

	public static void main(String[] args) {
		
	/*	//1.
		int i,j,rows=6;
		
		for(i=0;i<rows;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
			
	//2.
		
		int i1,j1,rows1=7;
		
		for(i1=0;i1<rows1;i1++)
		{
			for (j1=2*(rows1-i1); j1>=0; j1--)         
			{  
			//prints space between two stars      
			System.out.print(" ");   
			}   
			for(j1=0;j1<=i1;j1++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
			
		}
*/		
	//3. PYRAMID
		System.out.println("PYRAMID TRIANGLE");
		
		int rows=6;
		
		for(int i=1;i<rows;i++)
		{
			for(int j=i;j<=rows;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		//INVERSE PYRAMID
		
		System.out.println("INVERSE PYRAMID");
		
		int rows1=5;
		
		for(int i=1;i<=rows1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<rows1;j++)
			{
				System.out.print("* ");
			}
			for(int j=i;j<=rows1;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

		//  INCREASING TRIANGLE
		
		System.out.println("INCREASING TRIANGLE");
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		//  HOLLOW INCREASING TRIANGLE
		
		System.out.println("HOLLOW INCREASING TRIANGLE(it is always 1 to i)");
		
		int n1=5;
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==n1||j==1||j==i)
				System.out.print("* ");
			
			
			else
				System.out.print("  ");
			
			}
			System.out.println();
		}
		
		System.out.println("DECREASING TRIANGLE(i to n)");
		
		int t=5;
		for(int i=1;i<=t;i++)
		{
			for(int j=i;j<=t;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		
System.out.println("HOLLOW  DECREASING  TRIANGLE");
		
		int t1=5;
		for(int i=1;i<=t1;i++)
		{
			for(int j=i;j<=t1;j++)
			{
				if(i==1||j==1||j==t1)
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			
			System.out.println();
		}
		
		
	}
}


