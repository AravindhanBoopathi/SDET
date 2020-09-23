package ds.arrays.homework;

import java.util.Arrays;

import org.junit.Test;

public class P006bProductArrayOptimal {

	/* 6) Given an array nums of n integers where n > 1,  
return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Input:  [1,2,3,4]
Output: [24,12,8,6]

Input: [0,3,4,2]
Output: [ 24, 0, 0, 0]


Interview Question from Amazon


		
	 * 2. Traverse from i=0 till input.length
	 * 		Traverse from j=0 till input.length
	 * 			i. output[i] *= input[j]
	 * 
	*/
	
	private int[] solution(int[] input){
		
		int product =1,index=0;
		int output[]=new int[input.length];
		
		int zero = 0;
		
		
		if(input.length == 2){
			return input;
		}
		
		for (int i : input) {
			if(i!=0)
				product*= i;
			}
		System.out.println(product);
		
		
		for (int i = 0; i < input.length; i++){		
			if(input[i] == 0){
				zero++;
				index=i;
			}
		}
		
		if(zero == 1){
			output[index]=product/1;
			return output;
			}
		if(zero > 1){
			return output;
		}
		
		
		for (int i = 0; i < input.length; i++) {	
			input[i]= product/input[i];
		}
		return input;
	}
	
	@Test
	public void testData1(){

		int input[]= {3,0,1,2};
				
		System.out.println(Arrays.toString(solution(input)));

	}
	
}
