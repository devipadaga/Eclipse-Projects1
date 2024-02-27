package pyramidPatterns;



	//output not executing

		

public class PyramidPattrn5Program {

	public static void main(String[] args) {
		printPattern4(9);

	}
	
	private static void printPattern4(int rows) {
		// for loop for the rows
		for (int i = 1; i <= rows; i++) {
			int j;
			// white spaces in the front of the numbers
			int numberOfWhiteSpaces = (rows-i)*2;

			//print leading white spaces
			printString(" ", numberOfWhiteSpaces);

			//print numbers
			for(int x=1; x; j--) {
				System.out.print(j+" ");
			}

			//move to next line
			System.out.println(" ");
		}
	}
	
	private static void printPattern5(int rows) {
		// for loop for the rows
		for (int i = rows; i >= 1; i--) {
			int j;
			// white spaces in the front of the numbers
			int numberOfWhiteSpaces = i*2;

			//print leading white spaces
			printString(" ", numberOfWhiteSpaces);

			//print numbers
			for(int x=i; x=i; j--) {
				System.out.print(j+" ");
			}

			//move to next line
			System.out.println("");
		}
	}

	private static void printString(String s,int times) {	
		for(int j=0;j<times;j++) {
			System.out.print(s);
		}
	}

}
