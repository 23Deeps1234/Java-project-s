//Java Program to count the total number of characters in a string using a while loop

import java.util.*;

 class Character {
	
	 static int sum = 0;
	 static void main()
	  { 
	        Scanner s=new Scanner(System.in);
	        System.out.println("please enter string");
	        String val=s.nextLine();
	        int len=val.length();
	            for(int i=0;i<len;i++){
	                if(val.charAt(i)==' ')
	                    {
	                        continue;
	                    }
	                    sum++;
	                    }
	                    System.out.println(sum);
	                }
	    
			 public static void main(String[] args) {
			
			main();
	    }      
	}

