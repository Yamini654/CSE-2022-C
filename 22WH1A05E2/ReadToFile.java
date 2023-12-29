package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadToFile
{
	public static void main(String[] args)
	{
		try
		{
			File Obj = new File("myfile.txt");
			Scanner Reader = new Scanner(Obj);
			while (Reader.hasNextLine())
			{
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Content does not exist.");
		}
	}
}