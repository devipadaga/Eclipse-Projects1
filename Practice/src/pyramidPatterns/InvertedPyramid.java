package pyramidPatterns;

public class InvertedPyramid {

	public static void main(String[] args) {
		InversePattern(9);

	}
	
	private static void InversePattern(int rows) {
		for(int i=rows;i>=1;i--) {
			int numOfWhiteSpaces=rows-i;
			printString(" ", numOfWhiteSpaces);
			
			printString("* ", i);
			System.out.println(" ");
		}
	}
	
	
	private static void printString(String s,int times) {
		for(int j=0;j<times;j++) {
			System.out.print(s);
		}
	}

}
