package Three;

 class Online123 {
	
	static int i, j = 191919;
	 
    {
        --i;
    }

    {
        j++;
    }
}

public class Online
extends Online123
{
   static
   {
       i++;
   }

   static
   {
       --j;
   }

     
   public static void main(String[] args) {
	   System.out.println(i);
	   System.out.println(j);
   }
}
   















	


