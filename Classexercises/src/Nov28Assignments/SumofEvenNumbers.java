package Nov28Assignments;

import java.util.Scanner;

public class SumofEvenNumbers {

	public static void main(String[] args) {

		System.out.println("Enter a number to find the sum of all even numbers under it: ");
		  Scanner sc = new Scanner(System.in);
		int inputNumber =  (sc.nextInt());
		
		int sum = 0;
		
			for(int i = 0; i<=inputNumber; i+=2)
								
			sum = sum + i;
		
			 System.out.print(sum + " ");
	}

}
