package com.assignment;

public class Assignment1 
{ 
	 

	public static void main(String[] args) 
	{ 
		Assignment1 repeat = new Assignment1(); 
		int arr[] = {1, 2, 5, 5, 6, 6, 7, 2}; 
		int arr_size = arr.length; 
		int i, j; 
		System.out.println("Repeated Elements are :"); 
		for (i = 0; i < arr_size; i++) 
		{ 
			for (j = i + 1; j < arr_size; j++) 
			{ 
				if (arr[i] == arr[j]) 
				{
					System.out.print(arr[i] + " "); 
				}
				 
			} 
		} 
	
	} 
} 
