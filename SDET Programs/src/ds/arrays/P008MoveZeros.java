package ds.arrays;

import org.junit.Test;

public class P008MoveZeros {

	/* 
	 * Program to move all zeros to end(retain input order)
	 * 
	 * input:  1 0 5 9 0 1
	 * output: 1 5 9 1 0 0
	 * 
	 * 
	*/
	
	private void solution(int[] arr, int[] dep){
		
		int max=arr.length;
		
		for(int i=0; i< arr.length -1; i++){
			
			if(dep[i]>arr[i+1]){
				max--;
			}
			
			
		}
		System.out.println(max);
		
	}
	
	@Test
	public void testData1(){

		int arr[]= {540,580,590,660,900,1080};
		int dep[]= {560,720,680,690,1140,1200};
		solution(arr, dep);

	}

	
}
