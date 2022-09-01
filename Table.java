import java.util.Scanner;


public class Table {
   static void count() {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter");
     int m=  sc.nextInt();
     System.out.println("table:"+m);
    	for(int i=1;i<=10;i++)
    	{
    		System.out.println(m*i);	
    	}
}

public static void main(String []args)
{
	count();
}
}