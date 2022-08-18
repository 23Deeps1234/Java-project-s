
import java.util.*;

public class Array {

	void countVowels(String s)throws Exception {
		int strLength= s.length();
		//Creating array of string length
		char []arr= new char[strLength];
		int i;
		//Copying string character into array 
		for(i=0;i<strLength;i++) {
			arr[i]=s.charAt(i);
			
		}
		//Showing characters in array format
		System.out.print("The array is: ");
		for(i=0;i<strLength;i++) {
			System.out.print(" "+ arr[i]+" ");
		}
		System.out.println(" ");
		
		//Print vowels	
		int count=0;
		System.out.print("The vowels: ");
		for(i=0;i<strLength;i++) {
			if(arr[i]=='a'||arr[i]=='e'
					||arr[i]=='i'||arr[i]=='o'||
					arr[i]=='u') {
				System.out.print(" "+arr[i]+" ");
				count+=1;
				
			}
	
		}
		System.out.println(" ");
		System.out.println("The number of vowels: "+ count);

		
			
		
	} 

	
	public static void main(String args[]) {
		
		System.out.println("Enter any string: ");
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		
	Array obj= new Array();
	try {
		obj.countVowels(str);
	} catch (Exception e) {
	
		e.printStackTrace();
	}
		
		
	
}
}
