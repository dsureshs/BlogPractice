package com.examples;

import java.util.Scanner;
import java.util.Arrays;

public class Demo6 {

	public static void main(String[] args) 
	{
		int sub[] = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the subjects marks");
		
		//int sub1 = sc.nextInt();
		
		for (int i = 0; i<6; i++)
		{
		
		 sub[i] = sc.nextInt();
		 
		//System.out.println("Subjects marks is  " + sub[i]);
			
		}	
		for (int i = 0; i<6; i++) 
		{
			System.out.println("Subjects marks is  " + sub[i]);	
		}

		for (int i =0; i<sub.length; i++)
		{
			for (int j = i+1; j<sub.length; j++)
			{
				if (sub[i] == sub[j])
				{
					System.out.println("Same marks is : " + sub[i]);
				}
			}
		}
	}

}
