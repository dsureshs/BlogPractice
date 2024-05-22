package com.examples;

public class Arrays {

	public static void main(String[] args) 
	{
	int num [][]= {{1,2,3,4},{5,6,7,8}};
	
	System.out.println("length of an array is " +  num.length + " Dimensional ");
	//System.out.println(num[1][2]);

	
	for (int i=0; i<5; i++)
	{
		for (int j=0; j<4; j++)
		{
			try 
			{
			System.out.print(num[i][j] + " ");
			}
			catch (Exception e)
			{
				System.out.println("Exception handled");
			}
			
		}	
		System.out.println();
		
	}
	
		
	}

}
