/* 2.Write a method that takes a String[] as an argument and returns
a String containing the concatenation of all the strings in the
input array. Invoke your method 3 times with different arguments. Make
sure that your code handles the cases where the argument is null. */
public class Names {
	
//		accept  String array 
		static String strConcat(String s[])
		{
			StringBuilder builder = new StringBuilder();;
			try {
				if(s==null) {
					throw new Exception();
				}


				for(String s1 : s) {

					builder.append(s1+" ");
				}
			}catch(Exception e)
			{

				System.out.print("Array do not assign to Null");
			}
 
			return builder.toString();
		}
		public static void main(String[] args) {
//			 three array of Strings
			String s1[]= null;
			String s2[]= {"Dipanshi arora"};
			String s3[]= {"this is java project"};

			System.out.println(strConcat(s1));
			System.out.println(strConcat(s2));
			System.out.println(strConcat(s3));

		}
	}
	