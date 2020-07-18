package application;

import java.io.*;
import java.lang.*;
import java.util.*;

public class readFile 
{
	private Scanner x;
	
	//to read the file
	public static String a;
	public static String b;
	public static String c;
	public static String d;
	
	public boolean done = false;
	
	//save the file in formation as array
	public static String[] firstName = new String[5];
	public static String[] lastName = new String[5];
	public static int[] checking = new int[5];
	public static int[] saving = new int[5];
	
	public void openFile()
	{
		//try to open file if is there
		try
		{
			x = new Scanner(new File("accounts.txt"));
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
	
	public void addInfo(String filePath, String firstName, String lastName, int newCh, int newSa)
	{
		//make new file to save the updates
		String tempFile = "temp.txt";
		File oldFile = new File(filePath);
		File newFile = new File(tempFile);
		
		//try if it works to change the info
		try
		{
			FileWriter fw = new FileWriter(tempFile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			x = new Scanner(new File(filePath));
			
			while(x.hasNext())
			{
				a = x.next();
				b = x.next();
				c = x.next();
				d = x.next();
				
				if(a.equals(firstName) && b.equals(lastName))
				{
					pw.println(a + " " + b + " " + newCh + " " + newSa);
				}
				else
				{
					pw.println(a + " " + b + " " + c + " " + d);
				}
			}
			done = true;
			x.close();
			pw.flush();
			pw.close();
			oldFile.delete();
			File dump = new File(filePath);
			newFile.renameTo(dump);
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
	
	//to read the file
	public void readFile()
	{
	
		int i = 0;
		while(x.hasNext())
		{
			a = x.next();
			firstName[i] = a;
			b = x.next();
			lastName[i] = b;
			c = x.next();
			checking[i] = Integer.parseInt(c);
			d = x.next();
			saving[i] = Integer.parseInt(d);
			
			i = i + 1;
		}
	}
	
	//to close
	public void closeFile()
	{
		x.close();
	}
}
