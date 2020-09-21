package ds.arrays.homework;

import java.util.Arrays;

import org.junit.Test;

public class P002aSquareBF {

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
      i)Traverse the array till its length
         a)input[i] element -> input[i] * input[i];
3) Sort the current array in Ascending order:
		      i)Traverse the array till its length - 1, to position the current element 
		      ii)Traverse the array from i+1 till its length, to position the next element
		          a)if(input[i] <= input[j])
		            continue;
		          b)if(input[i] > input[j])
		            temp = input[i]
		            input[i] = input[j];
		            input[j] = temp;
	 */



	private int[] squareArray(int[] input) {


		if(input[0]<0){
			if(input.length < 1){
				throw new IllegalArgumentException();
			}

			if(input.length >= 1){

				for(int i=0; i<input.length; i++) {

					input[i] *= input[i];

				}			
			}

			return sortCurrentArray(input);
		}


		if(input.length < 1){
			throw new IllegalArgumentException();
		}

		if(input.length >= 1){

			for(int i=0; i<input.length; i++) {

				input[i] *= input[i];

			}			
		}

		return input;




	}
/*
	3) Sort the current array in Ascending order:
	      i)Traverse the array till its length - 1, to position the current element 
	      ii)Traverse the array from i+1 till its length, to position the next element
	          a)if(input[i] <= input[j])
	            continue;
	          b)if(input[i] > input[j])
	            temp = input[i]
	            input[i] = input[j];
	            input[j] = temp;
	
	*/
	
	private int[] sortCurrentArray(int[] input) {

		for(int i=0; i<input.length - 1; i++) {
			for(int j=i+1; j<input.length; j++) {
				if(input[j] - input[i] >= 0){
				continue;
				}

				if(input[j] - input[i] < 0){
					int temp = input[j];
					input[j] = input[i];
					input[i] = temp;
				}
			}
		}
		return input;
	}


	@Test
	public void testData1(){

		int input[]= {-8,-3,3,4,10};

		System.out.println(Arrays.toString(squareArray(input)));

	}

	@Test
	public void testData2(){

		int input[]= {-8,-3,0,0,10};

		System.out.println(Arrays.toString(squareArray(input)));

	}

	@Test
	public void testData3(){

		int input[]= {0,1};

		System.out.println(Arrays.toString(squareArray(input)));

	}

	@Test
	public void testData4(){

		int input[]= {};

		System.out.println(Arrays.toString(squareArray(input)));

	}
}
