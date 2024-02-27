package pyramidPatterns;

public class DownTriangle {
	
	/*
	 			 * * * * * 
				  * * * * 
				   * * * 
				    * * 
				     * 
	 */

	public static void main(String[] args) {
		
		int n=6;
		for(int i=n-1;i>=0;i--) {
            
            System.out.print(" ");
            for(int j=i;j<=n;j++)
            {
                    System.out.print(" ");
            }
            for(int j=i;j>0;j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

	}

}
