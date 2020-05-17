package com.assignment;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 
import java.util.*; 

public class Assignment3 { 
	 

	public static void main(String[] args) 
	{ 
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		int sum=0;
		
		int arr[] = {1, 2, 5, 5, 6, 6, 7, 2}; 
		for (int i=0;i<arr.length;i++)
		{ 
			 list.add(arr[i]);
			
		} 
		
		for (int i=0;i<arr.length;i++)
		{ 
			 int uniique_size= Collections.frequency(list,arr[i]);
			 
			 if(uniique_size ==1)
			 {
				 sum=sum+arr[i];
			 }
			 
			
		} 
		
		System.out.println(sum);
		  
	} 
} 
