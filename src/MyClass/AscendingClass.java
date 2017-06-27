package MyClass;

import java.util.Scanner;

public class AscendingClass {
	public static void main(String[] args) 

    {

    Scanner in= new Scanner(System.in);

    	System.out.println("enter the numbers");

    	int n1= in.nextInt();

    	int n2= in.nextInt();

    	int n3= in.nextInt();

    	displaySortedNumbers(n1,n2,n3);
    	 
    }

	private static void displaySortedNumbers(int n1, int n2, int n3) {

		
		if((n1<n2) &&(n2<n3)){

			System.out.println("the numbers sorted numbers are="+ n1+","+n2+","+n3);

		}

		if((n1<n2) &&(n2>n3)){

			System.out.println("the numbers sorted numbers  are="+ n1+","+n3+","+n2);

		}

		if((n1>n2) &&(n2>n3)){

			System.out.println("the numbers sorted numbers are="+ n3+","+n2+","+n1);

		}

				
	}

}
	
