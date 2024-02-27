package Three;

import java.util.Arrays;

public class ArrayRightRotation {

	public static void main(String[] args) {

		int[] arr=new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int limit=1;
        for(int k=1;k<=limit;k++) {
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--) {
            arr[i]=arr[i-1];         
        }
          arr[0]=temp;
        }
        System.out.println(Arrays.toString(arr));
	}

}
