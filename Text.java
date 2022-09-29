//write a java program to append text to an existing file..
package labio;

import java.io.*;

public class Text
{
	//main starts
   public static void main(String[] args)
   {
      try
      {
    	  //filewriter class for writing a file
         FileWriter fw = new FileWriter("D:\\lab1.txt", true);
         //appending text
         fw.write("\nthis is dipanshi project.");
         //closing the file
         fw.close();
         System.out.println("The data is successfully appended to the file.");
      }
      catch(IOException ioe)
      {
         System.out.print("\nSomething went wrong!");
      }
   }
}