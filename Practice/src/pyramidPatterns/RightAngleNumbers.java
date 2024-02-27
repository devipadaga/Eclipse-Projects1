package pyramidPatterns;

public class RightAngleNumbers {

	public static void main(String[] args) {
		
		for(int i=1;i<10;i++) {
            
            for(int j=1;j<=i;j++) {
                System.out.print(5*j+" ");
            }
            System.out.println();
        }
		
		
		
		for(int i='A';i<='Z';i++) {
            for(int j=i;j<='Z';j++)
            {
                    System.out.print(" ");
            }
            for(int j='A';j<=i;j++) {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }

	}

}
