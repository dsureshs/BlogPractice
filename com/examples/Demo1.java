package com.examples;

import java.util.Arrays;
public class Demo1 {

	public static void main(String[] args) 
	{
		//int sub1, sub2, sub3, sub4, sub5, sub6;
		 
		//sub1 = 90;
		//sub2 = 90;
		//sub3 = 9;
		//sub4 = 99;
		//sub5 = 90;
		//sub6 = 45;
		
	//	int total = sub1+ sub2 + sub3 + sub4 + sub5 + sub6;
		//System.out.println("Total Marks = " + total);
		
		int [] subjects = new int [6];
		subjects [0] = 90;
		subjects [1] = 89;
		subjects [2] = 9;
		subjects [3] = 99;
		subjects [4] = 90;
		subjects [5] = 45;
		
		for (int i=0; i<=5; i++)
		{
			System.out.println(subjects[i]);
		}
		Arrays.sort(subjects);
		System.out.println("After Sort");
		for (int i=0; i<=5; i++)
		{
			System.out.println(subjects[i]);
		}
		
		System.out.println("Low Marks = " + subjects [0]);
		System.out.println("High Marks = " + subjects [5]);
		
	}

}
