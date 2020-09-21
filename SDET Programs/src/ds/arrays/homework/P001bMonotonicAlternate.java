package ds.arrays.homework;

import org.junit.Test;
 
public class P001bMonotonicAlternate {

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

			2) check difference first and second element
					i) greater sequence function
						if the difference is greater than zero or equal, 
						then traverse through greater sequence function
				   ii) lesser sequence function
				   		if the difference is lesser than zero or equal, 
				   		then traverse through lesser sequence function
				   iii) if 0, then next 2 elements		

			3) Traverse array using a for loop from 2nd index to end-1 index of array
					i) for greater sequence
						a) compare if the difference(i element - i+1 element) is greater than or equal to zero. repeat till last element
						b) if the difference is lesser, return false

				   ii) for lesser sequence
						a) compare if the difference(i element - i+1 element) is greater than or equal to zero
						b) if the difference is lesser, return false
			4) return true if for loop is executed	

	 */



	private boolean monotonicArray(int[] input) {

		if(input.length < 2){
			throw new IllegalArgumentException();
		}


		int count=1,ncount=1,zcount=0;
			for(int i=0; i<input.length - 1; i++){
			if(input[i+1]-input[i]>0){
				//				1 2 3 4 5
				count += 1;
			}
			else if(input[i+1]-input[i]<0){
				//				1 2 3 4 5
				ncount += 1;
			}	
			else if(input[i+1]-input[i]==0){
				//				1 2 3 4 5
				zcount += 1;
			}	
			
		}

		
		if((count+zcount==input.length && count>1)|| (ncount+zcount==input.length  && count>1)){
			return true;
		}
		else
		return false;

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
		int input[]= {1,1,1,1};
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
