package revision.arrays.string;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class P011MaxDistance {

/*	
1) Given an array of integers and an integer k, 
find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and 
the absolute difference between i and j is at most k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
Example 3:
Input: nums = [1,2,3,2,2,3], k = 2
Output: true
Hint: Window Sliding

Pseudo-code:

1. Initialize:


2. Traverse int i from 0th index till input.length - 1
	2.1 initialize an empty list
	
	2.2 Traverse from int j=i till k - 1
		if(list.contains(input[j]))return true;
		else list.add(input[j])
	
*/

	private boolean solution(int[] input, int k){
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i < input.length-k; i++){
			
			for(int j=i; j < (i+k); j++){
				if(list.contains(input[j])){
					return true;
				}else{
					list.add(input[j]);
				}	
			}
			
			list.remove(input[i]);
		}

		
		return false;
	}

	@Test
	public void testData1(){

		int input[]= {1,2,3,1};
		int k = 3;
		System.out.println(solution(input,k));

	}

	@Test
	public void testData2(){

		int input[]= {1,2,3,1,2,3};
		int k = 2;
		System.out.println(solution(input,k));

	}

	
}