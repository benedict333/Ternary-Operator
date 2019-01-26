package Nov28Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to find the prime numbers uder it: ");
		  Scanner sc = new Scanner(System.in);
		int inputNumber =  (sc.nextInt());
		
		  int i =0;
	       int num =0;
	       
	      ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
	       //Empty String
	      

	       for (i = 1; i <= inputNumber; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the arraylist
		     primeNumbers.add( i);
		  }	
	       }	
	       System.out.println("Prime numbers under " + inputNumber + " are  shown below :-");
	       System.out.println(primeNumbers);

	}

}
