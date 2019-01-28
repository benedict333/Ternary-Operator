package Nov28Assignments;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		
		System.out.println((num % 2 == 0) ? num + "is even" : num + " is odd");
	}

}
