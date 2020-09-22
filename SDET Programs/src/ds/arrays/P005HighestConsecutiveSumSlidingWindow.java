package ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class P005HighestConsecutiveSumSlidingWindow {

	/*
	Given an array of integers and a number k. 
	Return the highest sum of any k consecutive elements in the array. // Medium
    
    [2,4,1,3,5,6,0,1,3,1] k=3 maxSum => 3+5+6 => 14
	 */		

	
	// 1 5 2 3 7 4

	// k =3

	// store inputArray.length = inputLength
	// while loop for checking whther the array can be split into 'K' elements - while( inputLength > k)
	// Add a for loop with length k and starting index as 0
	// get 3 elements and sum it and store it in an variable - 'Max'
	// add startingindex + 1 and inputLength - k

	
	private int getHighestSumOfSubArray(int array[],int k) {
		
			
		// if k > input length throws illegalArgumentException
		
		// Loop first k inputs and sum it and store as max_sum
		
		// initialize current_window_sum = max_sum
		
		// loop from the kth element to input length 
		
		// get current_window sum  += number[i] - number[i - target]
		// math.max(max_sum, current_window_sum)
		
		
		return 0;
	}
		
	

	@Test
	public void example1() {
		int[] input= {1,4,5,2,3,7,9,8};
		int k=3;
		System.out.println(getHighestSumOfSubArray(input,k));
	}
	
	
	@Test
	public void example2(){

		int[] input = {2,4,1,3,5,6,0,1,3,1};
		int k=3;
		System.out.println(getHighestSumOfSubArray(input,k));
	}

	
	
}
