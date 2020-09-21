package ds.arrays.homework;

import java.util.Arrays;

import org.junit.Test;

public class P004bKthLargestElementAlternate {

/*
	4) Find the kth largest element in an unsorted array. 
	Note: It is kth largest element in the sorted order, not the kth distinct element.

	
	Input: [3,2,3,1,2,4,5,5,6] 
	k = 3
	Output: 5
	
	Input: [-1,0,1,1] 
	k = 2
	Output: 1
	
	Input: [4,4,6] 
	k = 5
	Output: Exception
	
	------
	
	Pseudo-code:
	
	1. if(k > input.length), throw illegalexception
	
	2. Traverse the input from i to till length - current element
		i. Traverse the input from 0 to till length - next element
			a. if(input[i] >= input[j]), sortedInput{i]=input[i]
			b. if(input[j] > input[i]), sortedInput[i]=input[j]
			
	3. return sortedInput[k]		   
*/	
		
	private int solution(int[] input, int k){
		
		if(k > input.length){
			throw new IllegalArgumentException();
		}
		
		int max=input[0];
		
			
		
	
				
		
		return max;
	}
	
	@Test
	public void testData1(){

		int input[]= {3,2,3,1,2,4,5,5,6};
		int k=3;

		System.out.println(solution(input,k));

	}
	
	@Test
	public void testData2(){

		int input[]= {4,4,5,6};
		int k=4;

		System.out.println(solution(input,k));

	}
	
	@Test
	public void testData3(){

		int input[]= {-1,0,1,1};
		int k=2;

		System.out.println(solution(input,k));

	}
	
	@Test
	public void testData4(){

		int input[]= {4,4,6};
		int k=5;

		System.out.println(solution(input,k));

	}
	
}
