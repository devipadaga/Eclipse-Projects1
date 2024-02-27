package pyramidPatterns;

public class UpperTriangle {

	public static void main(String[] args) {
		
		
		// 		code NOT WORKING
		
		
		int n=5;
		for(int i='A';i<=n;i=i+2) {
            for(int j=i;j<=n;j=j+2)
            {
                    System.out.print("* ");
            }
            for(int j='A';j<=i;j=j+2) {
                if(j=='A' || j==i) {
                System.out.print((char)j+" ");
                }else {
                    System.out.print("* ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
	}

}
