package ds.string.homework;

import java.util.Arrays;

import org.junit.Test;

public class P010MedianArray {

/*	
7) Given two sorted arrays A1, A2. Write a code to find median of the arrays

Example 1:

Input:

A1 = [1,3]
A2 = [2]

Output: 2

Example 2:

Input:

A1 = [1,2]
A2 = [3,4]

Output: 2.5

	
	
	
	
	
*/
	
private String solution(int[] input1,int[] input2){
		
		int[] output = new int[Math.addExact(input1.length, input2.length)];
		
		 System.arraycopy(input1, 0, output, 0, input1.length);
		 System.arraycopy(input2, 0, output, input1.length, input2.length);
		 
		 Double average = (double) 0;
		 
		 for(int i: output){
			 average += i;
		 }
		 
		 average = average / output.length;
		 
		return Double.toString(average);
	}
	
	@Test
	public void testData1(){

		int input1[]= {1,3};
		int input2[]= {2,4};
		
		System.out.println(solution(input1, input2));

	}


}
