package com.examples;

import java.util.Arrays;

public class Demo5
{
	public static void main(String[] args)
	{
		


	int [] subjects = new int [6];
	subjects [0] = 99;
	subjects [1] = 89;
	subjects [2] = 9;
	subjects [3] = 99;
	subjects [4] = 35;
	subjects [5] = 45;
	
	System.out.println("Total = "+ Arrays.stream(subjects).sum());
	System.out.println("Average = "+ Arrays.stream(subjects).average());
	System.out.println("High Marks = " + Arrays.stream(subjects).max());
	System.out.println("Low Marks = " + Arrays.stream(subjects).min());

	int total = 0;
	//int total1=0;
	int pass = 40;
	for (int i=0; i<=5;i++)
	{
		if  (subjects[i] <= pass)
				{
					System.out.println("Failed Subjects");
					System.out.println(subjects[i]);
					total = total + 1;
				}
		
	//	if (subjects[i] > 41)
		//{
			//System.out.println("Passed Subjects");
			//System.out.println(subjects[i]);
		//}
	}
	System.out.println("Number of failed subjects is " + total);
	}
}

