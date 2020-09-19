package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class P004SmallestMissingIntegerBF1 {

	/*
	Given an unsorted integer array, find the smallest missing positive integer. // Simple 
    [2,8,10,1,0, 2,1] => 3	

	 */
	
	//	Sort the input array
	//	Loop the array and Check index + 1 != Array Elements and print index + 1
	

	private int getMissingInteger(int[] input){

		int output=1;
		
		Arrays.sort(input);
		
		for(int i=0; i < input.length - 1; i++){
			
			if( input[i] == input[i+1]){
				continue;	
			}
			
			if( input[i] > 0 && input[i + 1] != input[i] + 1 ){
				output= input[i] + 1;
				break;
			}
			
		}
		
		return output;
		
//		throw new RuntimeException("No intersection found");
	}



	@Test
	public void example1(){

		int[] input = {-1,-2,-3};

		
		System.out.println(getMissingInteger(input));

	}
}
