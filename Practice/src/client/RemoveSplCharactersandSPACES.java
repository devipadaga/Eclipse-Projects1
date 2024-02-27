package client;

public class RemoveSplCharactersandSPACES {

	public static void main(String[] args) {
		
		String s="He is a very very good boy, isn't he?";
		String str="";
		
		String[] s1=s.replace(" ", ",").replace("?", ",").replace("'",",").split(",");
		
		for(int i=0;i<s1.length;i++)
		{
			if(!s1[i].equals(""))
			{
			str=str+s1[i];
			}
		}
		
		System.out.print(str);
	}

}
