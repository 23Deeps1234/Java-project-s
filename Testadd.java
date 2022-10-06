package maven1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testadd {
	Add ad=new Add();
	@Test
	//method for addition
	public void addition()
	
	{
		assertEquals(30,ad.addition(10,20));
		
	
		
	}
	
		@Test
		//method for multiplication
		public void multiplication()
		
		{
			assertEquals(25,ad.multiplication(5,5));
			
		
			
		}
}