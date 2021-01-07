package homework.ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class P001bMonotonicBF {

	/*
	3) Given an array, return true if and only if the given array A is monotonic.

			An array is monotonic if it is either monotone increasing or monotone decreasing.

			Input: [1,2,3,3,4,4,4,4,5]
			Output: true

			Input: [5,4,4,2,1,0]
			Output: true

			Input: [-3,-2,-2,-1,0,2]
			Output: true

			Input: [5,4,4,2,1,-5,-1]
			Output: false

			Input: [1,2,5,3,4,4,4,4,5]
			Output: false

			Input: [0]
			Output: false



			1) check if array has one element
				-  throw runtime exception

			2) Copy input array to "temp" and sort "temp"

			3) traverse input till input.length - 
				i. if (input[i] == temp[i]), return true  
				ii. else return false 	
	 */



	private boolean monotonicArray(int[] input) {

		if(input.length < 2){
			throw new IllegalArgumentException();
		}
			int [] increasing = input.clone();
			int [] decreasing = input.clone();
			//sort array in ascending
			for(int i=0; i<increasing.length; i++){
				
				for(int j=i+1; j<increasing.length; j++){
					
					if(increasing[i] < increasing[j]) {
								
						int temp = increasing[i];
						increasing[i] = increasing[j];
						increasing[j] = temp;
					}
				}
			}
			
			//sort array in descending
			for(int i=0; i<decreasing.length; i++){
				
				for(int j=i+1; j<decreasing.length; j++){
					
					if(decreasing[i] > decreasing[j]) {
								
						int temp = decreasing[i];
						decreasing[i] = decreasing[j];
						decreasing[j] = temp;
					}
				}
			}
			
			System.out.println(Arrays.toString(input));
			System.out.println(Arrays.toString(increasing));
			System.out.println(Arrays.toString(decreasing));
		
		for(int i=0; i<input.length; i++){

				if(input[i]==input[i+1]){
					continue;
				}

					if(input[i+1]<input[i]){
						return checkValues(input,increasing);
					}
					if(input[i+1]>input[i]){
						return checkValues(input,decreasing);
					}
		}
		return false;


	}

	

	private boolean checkValues(int[] input,int []temp) {
		boolean flag =false;
		for (int i = 0; i < temp.length; i++) {
				if(input[i]==temp[i]) {
					flag = true;
				}
				else {
					return false;
				}
		}
		return flag;
	}


	@Test
	public void testData1(){
		int input[]= {1,2,3,3,4,4,4,4,5};
		System.out.println("Array is monotonic :" +monotonicArray(input) );
	}

	@Test
	public void testData2(){
		int input[]= {5,4,4,2,1,0};
		System.out.println("Array is monotonic :" +monotonicArray(input) );
	}

	@Test
	public void testData3(){
		int input[]= {-3,-2,-2,-1,0,2};
			System.out.println("Array is monotonic :" +monotonicArray(input) );
	}

	@Test
	public void testData4(){
		int input[]= {5,4,4,2,1,-5,-1};
		System.out.println("Array is monotonic :" +monotonicArray(input) );
	}

	@Test
	public void testData5(){
		int input[]= {1,2,5,3,4,4,4,4,5};
		System.out.println("Array is monotonic :" +monotonicArray(input) );
	}

	@Test
	public void testData6(){
		int input[]= {1,1,1,2};
		System.out.println("Array is monotonic :" +monotonicArray(input) );
	}	
}
