package ALL;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Serial_AND_Deserial_in_HASHMAP {

	public static void main(String[] args) {

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Value1");
		hm.put(2, "Value2");
		hm.put(3, "Value3");
		hm.put(4, "Value4");
		hm.put(5, "Value5");

		try {
			FileOutputStream fos=new FileOutputStream("hashmap.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hm);
			oos.close();
			fos.close();
			System.out.printf("Serialized HashMap data is saved in hashmap.ser");
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}

		System.out.println("\n*****************************************************");
		HashMap<Integer, String> map = null;
	      try
	      {
	         FileInputStream fis = new FileInputStream("hashmap.ser");
	         ObjectInputStream ois = new ObjectInputStream(fis);
	         map = (HashMap) ois.readObject();
	         ois.close();
	         fis.close();
	      }
	      catch(IOException ioe)
	      {
	         ioe.printStackTrace();
	         return;
	      }
	      catch(ClassNotFoundException c)
	      {
	         System.out.println("Class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("\nDeserialized HashMap");
	      // Display content using Iterator
	      Set set = map.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry entry = (Map.Entry)iterator.next();
	         System.out.print("key: "+ entry.getKey() + " & Value: ");
	         System.out.println(entry.getValue());
	      }
	}

}
