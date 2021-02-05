package assignment2;

import java.util.Scanner;

public class ArraySmallest {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter no. of elements you want in array:");
                int n = scan.nextInt();
 
		int array[] = new int[n];
                System.out.println("Enter all the elements:");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = scan.nextInt();
		}
 
		int Smallest1, Smallest2, temp;
 
		Smallest1 = array[0];
		Smallest2 = array[1];
		
		if (Smallest1 > Smallest2)
		{
			temp = Smallest1;
			Smallest1 = Smallest2;
			Smallest2 = temp;
		}
 
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] < Smallest1)
			{
				Smallest2 = Smallest1;
				Smallest1 = array[i];
			}
			else if (array[i] < Smallest2 && array[i] != Smallest1)
			{
				Smallest2 = array[i];
			}
		}

		System.out.println ("The First Smallest is " + Smallest1);
		System.out.println ("The Second Smallest is " + Smallest2);
 
	}
}

	
