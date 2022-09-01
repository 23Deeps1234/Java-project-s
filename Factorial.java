import java.util.*;
public class Factorial
{
	static void count() {
		int n;
        String s="yes";
    	Scanner sc=new Scanner(System.in);
    	while(s.equals("yes"))
    	{
 
	 
	 System.out.println("enter");
	 n = sc.nextInt();
	 
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
           
        }
        System.out.println("Factorial of the number: "+fact); 
     
    	System.out.println("do you continue");
    	s=sc.next();
	}	
	}
	public static void main(String []args) {
		count();
			
	}
} 


