
/*3.Create a class Calculator with two methods add() and substract() and default and parameterized constructor
 Overload theses methods--
   int add(int,int)
   double add(double,int,int)
   String add(String,String)

  int subtract(int,int)
   double subtract(double,double)*/

package inheritance;

public class Calculator {
	 // add method
     public int add(int x, int y) { return (x + y); }
     
     public double add(double x, int y, int z)
     {
         return (x + y + z);
     }
     public String add(String x,String y) {
    	 return (x+y);
     }
   // subtract method
     public int sub(int x,int y) {
    	 return (x-y);}
     
    	 public double sub(double x,double y)  {
    		 return (x-y);
    	 }
     
     // main code
     public static void main(String args[])
     {
         Calculator a = new Calculator();
         System.out.println(a.add(10, 20));
         System.out.println(a.add(10.0, 20, 30));
         System.out.println(a.add("abc", "def"));
         System.out.println("addition completes");
         System.out.println(a.sub(9,8));
         System.out.println(a.sub(20.0, 9.0));
         System.out.println("Subtraction completes");
 }
}
