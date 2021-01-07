package homework.ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class P011ProductArrayExceptSelf {

	/* 

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true


	 */

	private int[] solution(int[] input){
		
		int n = input.length;
		
		int left = 0, right = n-1;
		
		int[] output = new int[n];
		
		output[left++] = output[right--] = 1;
		
		while(left < n){
			
			output[left] = output[left-1] * input[left++ - 1]; 
			output[right] = output[right+1] * input[right-- + 1];
			if(right<0) break;
		}
		
		
		return output;
	}

	@Test
	public void testData1(){

		int input[]= {1,2,3,4,5};

		System.out.println(Arrays.toString(solution(input)));

	}
	
}
