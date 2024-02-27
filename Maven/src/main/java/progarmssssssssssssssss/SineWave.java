package progarmssssssssssssssss;

public class SineWave {
	public static void signwave(int limit) 
	{
	
	int start1=limit-1;
	int end=limit;
	int start2=limit*4-1;
	for(int i=0;i<limit*2;i++) {
		
		for(int j=0;j<limit*4;j++) {
			
			if(j==start1){
				System.out.print("/");
			}else if(j==end) {
				System.out.print("\\");
			}else if(i>=limit && j==start2){
				System.out.print("/");
				start2--;
			}else {
				System.out.print("-");
			}			
		}
		start1--;
		
		end++;
		System.out.println();
	}
		
		
	}

	public static void main(String[] args) {
		
		signwave(4);

	}

}
