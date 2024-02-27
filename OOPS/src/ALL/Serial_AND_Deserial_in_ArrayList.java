package ALL;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Serial_AND_Deserial_in_ArrayList {

	public static void main(String[] args)  {

		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		try {
			FileOutputStream fos=new FileOutputStream("ArrayList.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.close();
			fos.close();
			System.out.printf("Serialized ArrayList data is saved in ArrayList.ser");
		}
		
		catch(IOException ioe) {
			ioe.printStackTrace();
			
		}
		
		
		try {
			FileInputStream fis=new FileInputStream("ArrayList.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			al=(ArrayList)  ois.readObject();
			ois.close();
			fis.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch(ClassNotFoundException cnf)
		{
			cnf.printStackTrace();
		}
		
		System.out.println("\nDESERIALIZATION :"+al);

	}

}
