package ds.arrays.string.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class P001MoveOddNumbers {

	/*

Given an array numbers, write a function to move all odd numbers to the end of it 
while maintaining the relative order of all elements.   

Example:
Input: [2,1,5,3,12] 
Output: [2,12,1,5,3]

Note: 
1. You must do this in-place without making a copy of the array. 
2. Minimize the total number of operations.


	 */	

	private String solution(int[] input){

		List<Integer> odd = new ArrayList<Integer>();
		List<Integer> even = new ArrayList<Integer>();
		
		for(int i : input){
			if(i%2!=0){
				odd.add(i);
			}else{
				even.add(i);
			}
		}
		
		even.addAll(odd);
		
//		int[] evenodd = even.stream().mapToInt(i -> i).toArray();
		
		int[] evenodd = new int[even.size()];
		int index = 0;
		for(int i: even){
			evenodd[index++]=i;
		}
		
		
		return Arrays.toString(evenodd);
	}

	@Test
	public void testData1(){

		int input[]= {2,1,5,3,12};

		System.out.println(solution(input));

	}




}
