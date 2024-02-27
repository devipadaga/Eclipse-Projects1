package pattern;

public class Characterpyramid {

	public static void main(String[] args) {
		
		
				 

/*
			A 
		   A B 
		  A B C 
		 A B C D 
		A B C D E 

 */
		for(int i=1;i<=5;i++)
		{
			char c='A';
			for(int k=i;k<5;k++)
			{
				System.out.print(" ");
			}			
			for(int j=i;j>0;j--)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println("");
		}

	}

}
