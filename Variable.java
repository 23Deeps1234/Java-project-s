//write a java program to read a file line by line and store it into a variable

package labio;

	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.FileReader;
	public class Variable {
		public static void main(String[] args)
		{
	        StringBuilder sb = new StringBuilder();
	        String strLine = "";
	        String str_data = "";
	        try 
			{
	            BufferedReader br = new BufferedReader(new FileReader("D:\\lab1.txt"));
	            while (strLine != null)
	            {
	                if (strLine == null)
						break;
	                str_data += strLine;
	                strLine = br.readLine();      
	            }
	            System.out.println(str_data);
	            br.close();
	        } 
			catch (FileNotFoundException e) 
			{
	            System.out.println("File not found");
	        } 
			catch (IOException e) 
			{
	            System.out.println("Unable to read the file.");
	        }
	     }
	}


