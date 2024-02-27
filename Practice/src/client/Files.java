package client;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Files {

	public static void main(String[] args) {
		
		
		//Create File
		System.out.println("***********Craete the file****************\n");
		
		try {
			File file=new File("File.txt");
			
			if(file.createNewFile())
			{
				System.out.println("File Created : "+file.getName());
			}
			
			else
				System.out.println("File Already Exists.....");
		}
		
		catch(Exception e)
		{
			System.out.println("Something went wrong..args....");
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Came to Finally Block in created Block");
		}

		System.out.println("\n***********Write Data into the file****************\n");
		//Write into File
		try 
		{
			FileWriter fileWrite=new FileWriter("File.txt");
			fileWrite.write("Im using FileWriter to write Data into the File");
			fileWrite.close();
			
			System.out.println("Successfully wrote the text into the File.........");
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Came to Finally BLock in Write Mode");
		}
		
		//Read Data from the file
		System.out.println("\n***********Read Data from the file****************\n");
		
		try
		{
			File file=new File("File.txt");
			Scanner read=new Scanner(file);
			
			while(read.hasNextLine())
			{
				String data=read.nextLine();
				System.out.println("Data is : "+data);
			}
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		//Get file Information
				System.out.println("\n***********Get file Information****************\n");
				
				File file = new File("file.txt");
			    if (file.exists()) {
			      System.out.println("File name: " + file.getName());
			      System.out.println("Absolute path: " + file.getAbsolutePath());
			      System.out.println("Writeable: " + file.canWrite());
			      System.out.println("Readable " + file.canRead());
			      System.out.println("File size in bytes " + file.length());
			    } else {
			      System.out.println("The file does not exist.");
			    }
				
		
	}

}
