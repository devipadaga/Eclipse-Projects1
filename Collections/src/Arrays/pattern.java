package Arrays;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	
		for(int i=1;i<5;i++)
        {			
			//char a='A';
			int n=1;
			for(int k=4;k>=i;k--)
			{
				System.out.print("  ");
			}
            for(int j=1;j<2*i;j++)
            {           	
                System.out.print(n%2+" "); 
                n++;
            	                           
            }
           
            System.out.println();
        }
        
        */
		
		
		
//     Jayesh
//      Jayes
//      Jaye
//       Jay
//        Ja
//          J
		
		String str="Jayesh" ;
		char[] c=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{	
			for(int k=i;k<str.length();k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(c[j]);
			}
			System.out.println("");
		}
	}

}
