/* Slip5 - Write programs in Java to sort i) List of integers ii) List of names. The objective of this assignment is to learn Arrays and Strings in Java*/

import java.util.*;
class Demo_Array
{
	int a[];
	int n;
	void accept()
	{
	     Scanner s = new Scanner(System.in);
	     System.out.print("Enter limit = ");	
	     n = s.nextInt();
	     a = new int[n];
	     System.out.println("Enter " + n + " values = ");
	     for(int i=0 ; i<n ; i++)
	         a[i] = s.nextInt();
	}
	void display()
	{
	     System.out.println("\nList of Integers = ");
	     for(int i=0 ; i<n ; i++)
	          System.out.print(a[i] + " ");	
	}
	void sort()
	{
	     int temp;	
	     for(int i=0 ; i<n ; i++)
	     {
	         for(int j=i+1 ; j<n ; j++)	
	         {
		if(a[i] > a[j])
		{
		     temp = a[i];
		     a[i] = a[j];	
		     a[j] = temp;
		}
	         }
	     }
	}
}
class Demo_String
{
	String a[];
	int n;
	void accept()
	{
	     Scanner s = new Scanner(System.in);
	     System.out.print("Enter limit = ");	
	     n = s.nextInt();
	     a = new String[n];
	     System.out.println("Enter " + n + " names = ");
	     for(int i=0 ; i<n ; i++)
	         a[i] = s.next();
	}
	void display()
	{
	     System.out.println("\nThe List of Names = ");
	     for(int i=0 ; i<n ; i++)
	          System.out.print(a[i] + " ");	
	}
	void sort()
	{
	     String temp;	
	     for(int i=0 ; i<n ; i++)
	     {
	         for(int j=i+1 ; j<n ; j++)	
	         {
		if(a[i].compareTo(a[j])>0)
		{
		     temp = a[i];
		     a[i] = a[j];	
		     a[j] = temp;
		}
	         }
	     }
	}
}
class Slip5 
{
    public static void main(String args[])
    {
	Scanner s = new Scanner(System.in);
	int ch;
	do
	{
	      System.out.println("\n1 : List of Integers"); 
	      System.out.println("2 : List of Names"); 
	      System.out.println("3 : Exit"); 
	      System.out.println("Enter Choice = "); 
	      ch = s.nextInt();		
	      switch(ch)
	      {
	             case 1 : Demo_Array da = new Demo_Array();
		         da.accept();
		         System.out.println("\nDisplay Before Sort"); 			 	
		         da.display();
		         da.sort();
		         System.out.println("\nDisplay After Sort"); 			 	
		         da.display();
		         break; 	
	             case 2 : Demo_String ds = new Demo_String();
		         ds.accept();
		         System.out.println("\nDisplay Before Sort"); 			 	
		         ds.display();
		         ds.sort();
		         System.out.println("\nDisplay After Sort"); 			 	
		         ds.display();
		         break; 						
 	      }	
	}while(ch!=3);
    }
}