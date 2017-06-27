package MyClass;

import java.util.Scanner;

public class Ascending {
	 public static void main(String[] args) 

	    {

	        Scanner in = new Scanner(System.in);

	        System.out.print("Enter nos of array elements");

	        int n, m;

	        n = in.nextInt();

	        int a[] = new int[n];

	        System.out.println("Enter all the elements:");

	       

	        for (int i=0;i<n;i++) 

	        {

	            a[i]=in.nextInt();

	        }

	        for (int i=0;i<n;i++) 

	        {

	            for (int j=i+1;j<n;j++) 

	            {

	                if (a[i]>a[j]) 

	                {

	                    m =a[i];

	                    a[i]= a[j];

	                    a[j]= m;

	                }

	            }

	        }

	        System.out.print("Ascending Order:");

	        for (int i=0;i<n-1;i++) 

	        {

	            System.out.print(a[i] + ",");

	        }

	        System.out.print(a[n-1]);

	    }

	}


