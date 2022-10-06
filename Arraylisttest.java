package maven1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import maven1.Arraylist;

//test class
public class Arraylisttest {
	//method-1 to check whether the arraylist is empty or not
	@Test
	public void isEmpty()
	{
		assertEquals(false,Arraylist.myArrayListMain().isEmpty());
	}
	//method-2 to check the size of the arraylist
	@Test
	public void sizeArrayListTest()
	{
		assertEquals(5,Arraylist.myArrayListMain().size());
	}
	
}