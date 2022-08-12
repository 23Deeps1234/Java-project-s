package factorial;

import java.util.Scanner;

public class Fact {

	public static void main(String args[]) {
		int a , factorial ,i;
		Scanner SC = new Scanner(System.in);
		System.out.println("enter a number:");
		a= SC.nextInt();
		factorial = 1;
		for(i=1;i<=a;i++) {
			factorial=factorial*i;
		}
		System.out.printf("the factorial of number of %d is %d" ,a,factorial);
	}

}
