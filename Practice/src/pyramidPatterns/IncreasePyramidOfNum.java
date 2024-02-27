package pyramidPatterns;

public class IncreasePyramidOfNum {

	public static void main(String[] args) {
		pattern(9);
		Revpattern(9);
	}
	
	
	private static void pattern(int rows) {
		for(int i=1;i<=rows;i++) {
			int NumOfWhiteSpaces=rows-i;
			printString(" ",NumOfWhiteSpaces );
			printString(i+" " , i);
			System.out.println(" ");			
		}
	}
	
		
		private static void Revpattern(int rows) {
			System.out.println("***************************");
			for(int i=rows;i>=1;i--) {
				int NumOfWhiteSpaces=rows-i;
				printString(" ",NumOfWhiteSpaces );
				printString(i+" " , i);
				System.out.println(" ");				
			}		
	}
	
	private static void printString(String s,int times) {	
		for(int j=0;j<times;j++) {
			System.out.print(s);
		}
	}
}
