package collection.java;



import java.util.ArrayList;

import java.util.TreeSet;

public class Booktree 
{
	void mylist()
	{
		TreeSet<Book> booktree=new TreeSet<>();
		Booklist1 b1=new Booklist1();
		ArrayList<Book> p1=new ArrayList<>();
		ArrayList<Book> p2=new ArrayList<>();
		b1.mylist(p1,p2);
		booktree.addAll(p1);
		booktree.addAll(p2);
		booktree.forEach(b->System.out.println(b));
		System.out.println("Number of elements:"+booktree.size());
		System.out.println("First:"+booktree.first());
		System.out.println("Last:"+booktree.last());
	}
	public static void main(String[]args) {
		Booktree bt=new Booktree();
		bt.mylist();
	}
}