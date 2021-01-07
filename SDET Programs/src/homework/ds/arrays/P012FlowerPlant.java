package homework.ds.arrays;  

import org.junit.Test;

public class P012FlowerPlant {

	/* 
You have a long flowerbed in which some of the plots are planted, and some are not. 
However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, 
and an integer n, return if n new flowers can be planted in the flowerbed 
without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

10000
	 */

	private boolean solution(int[] input, int n){

		int zeroCount = 0;
		int count = 0;

		for(int i=1; i<input.length-1; i++){

			if(input[0] == 0 && input[1] == 0){
				count++;
				input[0] = 1;

			}
			if(input[input.length - 1] == 0 && input[input.length - 2] == 0){
				count++;
				input[input.length - 1] = 1;
			}

			if(input[i] == 0){
				zeroCount++;
				if(zeroCount > 2){
					count++;
					zeroCount = 1;
				}
			}
		}
		System.out.println(count);
		if(count>=n) return true;

		return false;
	}

	@Test
	public void testData1(){

		int flowerbed[]= {1,0,0,0,0,0,1};
		int n = 1;

		System.out.println(solution(flowerbed, n));

	}

}
