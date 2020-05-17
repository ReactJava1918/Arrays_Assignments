package com.assignment;

import java.util.Arrays;

public class Assignment2 
{ 
	 

	public static void main(String[] args) 
	{ 
		Assignment2 repeat = new Assignment2(); 
		int arr[] = {1, 2, 5, 5, 6, 6, 7, 2}; 
		int arr_size = arr.length; 
		int i, j; 
		
		for (i = 0; i < arr_size; i++) 
		{ 
			for (j = i + 1; j < arr_size; j++) 
			{ 
				if (arr[i] == arr[j]) 
				{
					//System.out.print(arr[i] + " "); 
					arr[j] = arr[arr_size-1];
                    
					arr_size--;
                     
                    j--;
					
					
				}
					
			} 
		} 
		
		
		
		int[] array1 = Arrays.copyOf(arr, arr_size);
        
        
         
        System.out.println();
         
        System.out.println("Array with unique values : ");
         
        for (int m = 0; m < array1.length; m++)
        {
            System.out.print(array1[m]+"\t");
        }
         
        System.out.println();
         
        System.out.println("---------------------------");
	
	} 
} 
