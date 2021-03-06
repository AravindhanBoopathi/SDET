package revision.arrays.string;

import org.junit.Test;

public class P002RiverRecords {

	/*	

	Given an array of integers, without reordering, 
	determine the maximum difference between any element and any prior smaller difference.
	If there is never a lower prior element, return -1.   

	Example 

	arr = [5, 3, 6, 7, 4]   

	There are no earlier elements than arr[0]. 
	There is no earlier reading with a value lower than arr[1]. 

	There are two lower earlier readings with a value lower than arr[2] = 6: 

	arr[2] - arr[1] = 6 - 3 = 3 
	arr[2] - arr[0] = 6 - 5 = 1 

	There are three lower earlier readings with a lower value than arr[3] = 7: 

	arr[3] - arr[2] = 7 - 6 = 1 
	arr[3] - arr[1] = 7 - 3 = 4 
	arr[3] - arr[0] = 7 - 5 = 2 

	There is one lower earlier reading with a lower value than arr[4] = 4: 

	arr[4] - arr[1] = 4 - 3 = 1   

	The maximum trailing record is arr[3] - arr[1] = 4.   

	Example 

	arr = [4, 3, 2, 1]   

	No item in arr has a lower earlier reading, therefore return -1   

	Function Description 

	Complete the function maximumTrailing in the editor below.   

	maximumTrailing has the following parameter(s):     

	int arr[n]:  an array of integers  


	Returns:  int:  the maximum trailing difference, or -1 if no element in arr has a lower earlier value   


	pseudocode:
	
	- initialize low= input[0];
	- initialize diff
	- initialize max = -1
	- traverse the input from index 1 to till length -1
		- if(currentElement<lowElement)
				lowElement= CurrentElement;
				
		- if(currentElement>lowElement)
				int diff = input[i] - input[j];
				max = Math.max(diff,  max);

	 */	

	private int solutionOptimal(int[] input){

		int max = -1;
		int low = input[0];
		
		for(int i=1; i<input.length; i++){

			if(input[i] < low){
				low = input[i];
				
			}
			
			if(input[i] > low){
				int diff = input[i] - low;
				max = Math.max(diff,  max);
			}
		}
		
		
		
		return max;
	}
	
	
	
	private int solution(int[] input){

		int max = -1;
		
		for(int i=1; i<input.length; i++){
			for(int j=0; j <= i; j++){
				int diff = input[i] - input[j];
				max = Math.max(diff,  max);
			}
		}
		
		
		
		return max;
	}

	@Test
	public void testData1(){

		int input[]= {5, 3, 6, 7, 4, 2, 7};

//		System.out.println(solution(input));
		System.out.println(solutionOptimal(input));
	}

	@Test
	public void testData2(){

		int input[]= {7, 9, 5, 6, 3, 2};

//		System.out.println(solution(input));
		System.out.println(solutionOptimal(input));
	}



}
