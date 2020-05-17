package com.assignment;

public class Assignment9 
{ 
	 

	public static void main(String[] args) 
	{ 
		Assignment9 repeat = new Assignment9(); 
		int arr[] = {3, 6, 8, -8, 10, 8}; 
		int arr_size = arr.length; 
		int i, j; 
		System.out.println("Repeated Elements are :"); 
		int count=0;
		for (i = 0; i < arr_size; i++) 
		{ 
			for (j = i + 1; j < arr_size; j++) 
			{ 
				//System.out.println(arr[i]+arr[j]);
				if (arr[i]+arr[j] ==16) 
				{
					if(count==0)
					{
					System.out.print("("+arr[i]  +", "+arr[j]+")"); 
					count++;
					}
					else
					{
						System.out.print(",("+arr[i]  +", "+arr[j]+")");
					}
				}
				 
			} 
		} 
	
	} 
} 
