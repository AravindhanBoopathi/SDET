package homework.ds.string;

import java.util.Arrays;

import org.junit.Test;

public class P006SortColors {

/*
3) Sort Colors

Given an array nums with n objects colored red, white, or blue, 
sort them in-place so that objects of the same color are adjacent, 
with the colors in the order red, white, and blue.

Here, use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
Example 3:

Input: nums = [0]
Output: [0]
Example 4:

Input: nums = [1]
Output: [1]

	
-	Sort ascending
or

- count no. of 0s, 1s and 2s and print	
	
	
	
*/
	
private String solution(int[] input){
		
		
	for(int i=0; i< input.length; i++){
		for(int j=i+1; j< input.length; j++){
			if(input[i]>input[j]){
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
			}
			
		}
	}
	
	
		return Arrays.toString(input);
	}
	
	@Test
	public void testData1(){

		int input[]= {2,0,2,1,1,0};

		System.out.println(solution(input));

	}

	
}
