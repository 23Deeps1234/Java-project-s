package maven1;

public class Palindrome {
	//method starts
	public static  boolean ispalindrome(String str)
	{
			{
				String rev="";
				//using for loop
			for(int i=str.length()-1;i>=0;i--)
				{
				 rev=rev+str.charAt(i);
				}
			//checking whether a string is palindrome or not
				if(str.equals(rev))
					return true;
				else 
					return false;
			}
		}
	}      
	     





