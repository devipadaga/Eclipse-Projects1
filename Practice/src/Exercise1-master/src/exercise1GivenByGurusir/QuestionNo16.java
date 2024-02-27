package exercise1GivenByGurusir;

public class QuestionNo16 {

	public static void main(String[] args) {
		
		int [] arr={0,1,2,3,5,6,7};
		
		int target=10;
		
		System.out.println(getIndexOfTargetvalue1(arr,target));

	}

	public static int getIndexOfTargetvalue1(int[] arr, int target) {


		for(int i=0;i<arr.length;i++) {

			if(arr[i]==target || arr[i]>target) {

				return i-1;
			}

		}

		return arr.length-1;
	}
}
