package ds.arrays.homework;

import java.util.Arrays;

import org.junit.Test;

public class P005MissingNumberBF {

	/*
	5) Find all the missing numbers in the given array

	Input: [4,3,2,7,8,2,3,1]
	Output: [5,6]

	Input: {-1,-4,-5,1,2,3,3}
	Output: {-3,-2,0}

	Input: {-1,-1,1,3,0,2}
	Output: {}

	Input: {1}
	Output: {}

	----------

	1. if(input.length<2),throw illegalArgument

	2. Sort the input array:
		i.Traverse the input array from 0 to till the input.length - current element
			a. Traverse the input array from i+1 to till the input.length - next element

				if(input[i]>input[j])

				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;

	3. Find missing numbers
		i.Traverse the input array from 0 to till the input.length - current element		
			a. int dif = input[i+1] - input[i]; 
				if(dif > 1 )
					  for(int j=0; j<diff-1; j++){
					  		syso(input[i]+1);
						}

	 */


	private void solution(int[] input){

		if(input.length<2){
			throw new IllegalArgumentException();
		}

		//		5 4 3 3

		for(int i=0; i<input.length; i++){
			for(int j=i+1; j<input.length; j++){
				if(input[i] > input[j]){
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}

		}

		System.out.println(Arrays.toString(input));


		for(int m=0; m < input.length -1 ; m++){

			int diff = input[m+1] - input[m];
			
			
				if(diff > 1){

				for(int n=1; n < diff; n++){	
					System.out.println(input[m]+n);
				}


			}
		}



	}

	@Test
	public void testData1(){

		int input[]= {4,3,2,7,8,2,3,1};

		solution(input);

	}

	@Test
	public void testData2(){

		int input[]= {-1,-4,-5,1,2,3,3};

		solution(input);

	}
	
	@Test
	public void testData3(){

		int input[]= {-1,-1,1,3,0,2};

		solution(input);

	}

	@Test
	public void testData4(){

		int input[]= {1};

		solution(input);

	}
}
