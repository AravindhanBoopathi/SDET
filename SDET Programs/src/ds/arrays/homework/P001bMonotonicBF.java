package ds.arrays.homework;

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


		for(int i=0; i<input.length-1; i++){

			if(input[i]-input[i+1] == 0){
				continue;
			}


//			if(input[i]-input[i+1] != 0){

				if(input[i+1]-input[i] > 0){
					return compareGreater(input);
				}
				if(input[i+1]-input[i] < 0){
					return compareLesser(input);
				}

//			}

		}

		return false;

	}

	private boolean compareGreater(int[] input){

		int count=1;
		for(int i=1; i<input.length - 1; i++){
			if(input[i+1]-input[i]>=0){
				//				1 2 3 4 5
				count += 1;
			}	
		}

		if(count == input.length-1){
			return true;
		}else{
			return false;
		}

	}

	private boolean compareLesser(int[] input){

		int count=1;
		for(int i=1; i<input.length - 1; i++){
			if(input[i+1]-input[i]<=0){
				//				1 2 3 4 5
				count += 1;
			}	
		}

		if(count == input.length-1){
			return true;
		}else{
			return false;
		}
	}


	@Test
	public void testData1(){
		int input[]= {1,2,3,3,4,4,4,4,5};
		if(monotonicArray(input)) {
			System.out.println("Array is monotonic :" +monotonicArray(input) );
		}else {
			System.out.println("Array is monotonic :" +monotonicArray(input) );
		}
	}

	@Test
	public void testData2(){
		int input[]= {5,4,4,2,1,0};
		if(monotonicArray(input)) {
			System.out.println("Array is monotonic :" +monotonicArray(input) );
		}else {
			System.out.println("Array is monotonic :" +monotonicArray(input) );
		}
	}

	@Test
	public void testData3(){
		int input[]= {-3,-2,-2,-1,0,2};
		if(monotonicArray(input)) {
			System.out.println("Array is monotonic :" +monotonicArray(input) );
		}else {
			System.out.println("Array is monotonic :" +monotonicArray(input) );
		}
	}

	@Test
	public void testData4(){
		int input[]= {5,4,4,2,1,-5,-1};
		if(monotonicArray(input)) {
			System.out.println("Array is monotonic :" +monotonicArray(input) );
		}else {
			System.out.println("Array is monotonic :" +monotonicArray(input) );
		}
	}

	@Test
	public void testData5(){
		int input[]= {1,2,5,3,4,4,4,4,5};
		if(monotonicArray(input)) {
			System.out.println("Array is monotonic :" +monotonicArray(input) );
		}else {
			System.out.println("Array is monotonic :" +monotonicArray(input) );
		}
	}

	@Test
	public void testData6(){
		int input[]= {1,1,1,2};
		if(monotonicArray(input)) {
			System.out.println("Array is monotonic :" +monotonicArray(input) );
		}else {
			System.out.println("Array is monotonic :" +monotonicArray(input) );
		}
	}	
}
