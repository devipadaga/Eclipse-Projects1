package pyramidPatterns;

public class Characters {

	public static void main(String[] args) {
		
		int ch=65;
		for(int i=1;i<=5;i++)
        {
            for(int j=i;j<5;j++)
            {
                System.out.print(" ");    
            }
        
              for(int j=1;j<=i;j++)
                {
                        System.out.print((char)(ch+j-1)+" ");
                }
            System.out.println(" ");
        }

	}

}
