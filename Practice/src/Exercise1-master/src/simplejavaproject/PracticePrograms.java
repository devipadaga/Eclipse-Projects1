package simplejavaproject;

public class PracticePrograms {

	public static void waterfallsentence() {
		
		String str="My name is Jayesh";

		String arr[]=str.split(" ");

		int n=0;
		for(int i=0;i<arr.length;i++) {

			if(i>0) {

				n=n+arr[i-1].length();
				for(int k=0;k<n;k++){

					System.out.print("-");
				}
			}
			System.out.println(arr[i]+"");
		}
	}

	public static void main(String [] args) {
		
		String str="Jayesh";
		int len=str.length();
		for(int i=0;i<str.length();i++) {
			
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<len;j++) {
				
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
			len--;
		}


//            J a y e s h
//             J a y e s 
//              J a y e
//               J a y
//                J a
//                 J


	}
}
