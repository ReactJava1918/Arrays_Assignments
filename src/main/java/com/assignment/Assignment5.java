package com.assignment;

import java.util.Arrays;

public class Assignment5 { 
	
	public static void main(String[] args) 
	{ 
		
		int arr[] = {1, 2, 5, 9, 6, 4, 7, 2}; 
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
         
        array(array1);
	
	} 
	
	
    public static void array(int arr[]) {        
            
        //Initialize array     
       // int [] arr = new int [] {6, 8, 1, 9, 2, 1, 10};     
        int temp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
        System.out.println(); 
        
        if(arr.length<3)
        {
        	System.out.println("we cant find second min and second max");
        }else
        {
        System.out.println("second max element is ="+arr[arr.length-2]);
        System.out.println("second Min elementis ="+arr[1]);

        }
         
        
        }
       
}    