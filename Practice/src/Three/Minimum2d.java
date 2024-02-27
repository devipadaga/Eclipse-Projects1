package Three;

public class Minimum2d {

	public static void main(String[] args) {
		
		int abc[][]= {{2,4,5},{3,2,10},{1,2,0}};
		
		
		int minValue = abc[0][0];
        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc[i].length; j++) {
                if (abc[i][j] < minValue ) {
                    minValue = abc[j][i];
                }
            }
        }
        System.out.println(minValue);

        
        int maxValue = abc[0][0];
        for(int i=0;i<abc.length;i++)
        {
        	for(int j=0;j<abc[i].length;j++)
        	{
        		if(abc[i][j]>maxValue)
        		{
        			maxValue=abc[i][j];
        		}
        	}
        }
        System.out.println(maxValue);
        
        /////////////////////////////////////////////////////////////////////////
        int arr[][]= {{2,4,5},{3,2,10},{1,2,0}};
        int min=arr[0][0];
        int maxfrommin=arr[0][0];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
               if(arr[j][i]<min) {
                   min=arr[j][i];
                   maxfrommin=min;
                   for(int k=0;k<arr[i].length;k++) {
                       if(arr[k][j]>maxfrommin) {
                           maxfrommin=arr[k][j];
                       }
                   }
               }
            }
        }
        
        System.out.println(min);
        System.out.println(maxfrommin);
	}

}
