package inheritance;
//main class 
	public class Main 
	{
//main method called
		public static void main(String args[])
		{
			Square s1=new Square();
			s1.area();
			System.out.println("The area of the square is : "+s1.area());//print(length*length)
			
			Rectangle s2=new Rectangle();
			s2.area();
			System.out.println("The area of the rectangle is : "+s2.area());//print(length*width)
		}
	}

