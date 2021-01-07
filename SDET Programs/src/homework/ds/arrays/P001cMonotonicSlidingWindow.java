package homework.ds.arrays;

import org.junit.Test;
 
public class P001cMonotonicSlidingWindow {

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

			Input: [1,1]
			Output: false



			
	 */



	private boolean monotonicArray(int[] input) {

		if(input.length < 2){
			throw new IllegalArgumentException();
		}


		int positiveCount=1,negativeCount=1,zeroCount=0;
			for(int i=0; i<input.length - 1; i++){
			if(input[i+1]-input[i]>0){
				//				1 2 3 4 5
				positiveCount += 1;
			}
			else if(input[i+1]-input[i]<0){
				//				1 2 3 4 5
				negativeCount += 1;
			}	
			else if(input[i+1]-input[i]==0){
				//				1 2 3 4 5
				zeroCount += 1;
			}
			
			if(positiveCount > 1 && negativeCount >1) {
				return false;
			}	
			
		}

		
		if((positiveCount+zeroCount==input.length && positiveCount>1)|| 
				(negativeCount+zeroCount==input.length  && positiveCount>1)){
			return true;
		}
		else
		return false;

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
