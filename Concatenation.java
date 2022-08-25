/* 3.Create two arrays. One containing String values: Peter , Amy, John ,Boyd, and
Cathy, and another one containing int values: 15,9, 14, 10,and 12.
 create an  table showing  these values as name value pairs as below.

Name           Value

Amy		    9
Boyd		10
Cathy		12
John		14
Peter		15*/
public class Concatenation {


//	 accept both array value
	static void joinArr(String s[],int arr[])
	{
		
		System.out.println("Names\tValues\n");
		for(int i=0;i<s.length;i++)
		{
				System.out.println(s[i]+"\t"+arr[i]);
		}
	}

//	main method begins
	public static void main(String[] args) {

		String st[] = {"Peter","Amy","John","Boyd","Cathy"};
		

		int a[] = {15,9,14,10,12};
		

		joinArr(st,a);
		System.out.println("all values are assighned");
	}
  
}
