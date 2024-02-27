package pyramidPatterns;

public class IncreasingPyramid {

	public static void main(String[] args) {
		
		int rows=9;
		pattern(rows);
		

	}

	
	
	public static void pattern(int rows) {
		
		for(int i=1;i<=rows;i++)
		{
			int numOfWhiteSpaces=rows-i;
			printString(" ",numOfWhiteSpaces);
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
				}
			System.out.println(" ");
			}
		
		}
	


	//utility function to print string given times
		private static void printString(String s, int times) {
			for (int j = 0; j < times; j++) {
				System.out.print(s);
			}
		}

}


