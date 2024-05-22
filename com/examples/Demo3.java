package com.examples;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo3 {

	public static void main(String[] args) 
	{
		int [] subjects = new int [6];
		subjects [0] = 90;
		subjects [1] = 89;
		subjects [2] = 9;
		subjects [3] = 99;
		subjects [4] = 90;
		subjects [5] = 45;
		
		
		//IntStream marks = Arrays.stream(subjects);
		System.out.println("Total = "+ Arrays.stream(subjects).sum());
		System.out.println("Average = "+ Arrays.stream(subjects).average());
		System.out.println("High Marks = " + Arrays.stream(subjects).max());
		System.out.println("Low Marks = " + Arrays.stream(subjects).min());
	}

}
