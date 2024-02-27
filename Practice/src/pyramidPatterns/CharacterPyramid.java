package pyramidPatterns;

public class CharacterPyramid {
	
	/*
	 			 *  
	 			* *  
	 		   * * *  
              * * * *  
             * * * * *  
	 */

	public static void main(String[] args) {
		char rows=5;
		printChar(rows);

	}
	
	private static void printChar(char rows) {
		
		// for loop for the rows
		for(int i=1;i<=rows;i++)
		{
			// white spaces in the front of the numbers
			int numOfWhiteSpaces=rows-i;
			//print leading white spaces
			printString(" ", numOfWhiteSpaces);

			//print character
			printString("* ", i);
			System.out.println(" ");			
		}		
	}	
	private static void printString(String s,int times) {
		
		for(int j=0;j<times;j++)
		{
			System.out.print(s);
		}
		
	}

}
