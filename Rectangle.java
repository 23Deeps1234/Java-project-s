//b.Rerctangle---with  one more data member --width ----class will extend Square
package inheritance;


	public class Rectangle extends Square implements Shape
	{
	public int width=4;
		

		public int area()
		{
			int area=length*width;
			return area;
		}
		
		
	}


