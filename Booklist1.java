package collection.java;

import java.util.ArrayList;
import java.util.List;

public class Booklist1 {
 static List<Book> book1;
 static List<Book> book2;
  public void mylist(ArrayList p1,ArrayList p2)
  {
	  book1=new ArrayList<>();
	  book2=new ArrayList<>();
	  Book b1=new Book(1,"java","aa");
	  Book b2=new Book(2,"c","cca");
	  Book b3=new Book(3,"c++","rra");
      Book b4=new Book(4,"c#","na");
	  Book b5=new Book(5,"html","bb");
	  Book b6=new Book(7,"python","dd");
	    
	  p1.add(b1);
	  p1.add(b2);
	  p1.add(b3);
	 p2.add(b4);
	  p2.add(b5);
	  p2.add(b6);
	 System.out.println("book1...");
	  book1.forEach(b->System.out.println(b));
	 System.out.println("book2...");
	  book2.forEach(b->System.out.println(b));
  }
}
