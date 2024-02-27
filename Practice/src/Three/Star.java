package Three;

public class Star {

	public static void main(String[] args) {
		
//		int m=5;
//        for(int i=0;i<m;i++) {
//            for(int j=i;j<=m;j++)
//            {
//                    System.out.print("");
//            }
//            for(int j=0;j<=i;j++)
//            {
//                    System.out.print("* ");
//            }
//            System.out.println("");
//            
//        }
		
//		int n=5;
//		for(int i=n;i>0;i--)
//        {
//           for(int j=0;j<i;j++)
//           {
//               System.out.print("* ");
//           }
//           System.out.println();
//        }

		
		int n=5;
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
