package Three;

public class RelaceWordinSTRING {

	public static void main(String[] args) {
		
		String str = "Blue bottle is in Blue bag lying on Blue carpet";
		System.out.println(str);
		
		String[] s=str.split(" ");
		String newS="";
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals("Blue"))
			{
				s[i]="Red";
				
			}
			newS=newS+" "+s[i];
		}
		System.out.println(newS);		
	}

}
