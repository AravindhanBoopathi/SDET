package ds.arrays.homework;

import java.util.Arrays;

import org.junit.Test;

public class P002bSquareAlternate {

	/*Given an array of integers sorted in non-decreasing order, 
	 * return an array of the squares of each number, also in sorted non-decreasing order.

	Input: [-8,-3,3,4,10]
	Output: [9,9,16,64,100]

	Input: [-8,-3,0,0,10]
	Output: [0,0,9,64,100]

	Input: {0,1}
	Output: {0,1} 

	Input: {}
	output: Exception

	pseudocode :

	1)  If input is null -> Illegal Argument Exception

	2)	If input.length > 1

		1. Initialize left=0 and right=n-1

		2. if abs(left) >= abs(right) 
			i. input[right] = square(input[left])

		3. else 
			i. input[right] == square(input[right]) 

		4. right--;


	 */



	private int[] squareArray(int[] input) {

		System.out.println(Arrays.toString(input));

		if(input.length < 1){
			throw new IllegalArgumentException();
		}

		int[] output = new int[input.length];
		int left = 0, right = input.length - 1;

		for(int i=input.length-1; i>=0; i--) {
			if(Math.abs(input[left]) >= Math.abs(input[right])){
				output[i] = input[left]*input[left];
				left++;
			}
			else{
				output[i] = input[right]*input[right];
				right--;
			}
		}

		return output;


	}


	@Test
	public void testData1(){

		int input[]= {-8,-3,3,4,10};

		System.out.println(Arrays.toString(squareArray(input)));

	}

	@Test
	public void testData2(){

		int input[]= {-8,-3,0,3,8};

		System.out.println(Arrays.toString(squareArray(input)));

	}


	@Test
	public void testData3(){

		int input[]= {-3,1,2};
		// 1 4 9
		System.out.println(Arrays.toString(squareArray(input)));

	}

	@Test
	public void testData4(){

		int input[]= {4,5,6,7};

		System.out.println(Arrays.toString(squareArray(input)));

	}
}
