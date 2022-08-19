import java.util.Scanner;

public class Vowels {


		int countVowels(String str) {
			int c=0; 
			str=str.toUpperCase();
//			converting String in Char array
			char newCharArray[] = str.toCharArray();
//			loop start to check whether the char is vowel or not
			for(int i=0;i<newCharArray.length;i++)
			{
				if( (newCharArray[i]=='A') || (newCharArray[i]=='E') || (newCharArray[i]=='I') || (newCharArray[i]=='O') ||  (newCharArray[i]=='U')   )
					c++;
//				if x is present it throws exception 
				if(newCharArray[i]=='X') {
					try {
						throw new Exception();
					}
					catch(Exception e) {
						System.out.println("letter x throws Exception");
					}
				}
			}
 
			return c;
		}

		public static void main(String[] args) {

			Vowels v = new Vowels();


			Scanner s = new Scanner(System.in);
			System.out.println("Enter a Sring : ");
			String str=s.next();


			int result = v.countVowels(str);

			System.out.println("total vowels : "+result);

			s.close();
		}
	}
	


