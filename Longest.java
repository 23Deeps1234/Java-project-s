
// write the java program to find the longest word in a text file
package labio;


import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
public class Longest {

	public static void main(String[] args)throws FileNotFoundException
	{
      new Longest().findLongestWords();
	}

	public String findLongestWords() throws FileNotFoundException
	{
	String longest_word = "";
	String current;
	//scanner class for reading file
	Scanner SC = new Scanner(new File("D:\\lab1.txt"));
	while (SC.hasNext())
	{
		current = SC.next();
		if (current.length()> longest_word.length())
		{
			longest_word=current;
		}
	}
	System.out.println("\n"+longest_word+"\n");
	return longest_word;
	}

}

