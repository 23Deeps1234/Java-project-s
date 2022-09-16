package collection.java;
import java.util.ArrayList;
import java.util.Iterator;

public class BookList  
{
	public static void main(String args[])
	{
		ContainsList();
	}	
	public static void ContainsList()
	{
       ArrayList list1=new ArrayList();
		
		Books ob1=new Books(101,"eng","riya mam");
		Books ob2=new Books(102,"hindi","suresh sir");
		Books ob3=new Books(103,"maths","madhu mam");
		
		ArrayList list2=new ArrayList();
		
		Books ob4=new Books(104,"sci","Madhav sir");
		Books ob5=new Books(105,"ss ","kavita mam");
		Books ob6=new Books(106,"phy","nisha mam");
		
		list1.add(ob1);
		list1.add(ob2);
		list1.add(ob3);
		
		list2.add(ob4);
		list2.add(ob5);
		list2.add(ob6);
		
		System.out.println("List1 conatining objects "+"\n");
		Iterator it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println("Array list1 output: "+it.next());
		}
		System.out.println("\n");
		System.out.println("List2 conatining objects "+"\n");
		Iterator it2=list2.iterator();
		while(it2.hasNext())
		{
		System.out.println("Array list2 output: "+it2.next());
		}
	}
}
