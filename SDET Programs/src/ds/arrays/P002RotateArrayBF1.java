package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class P002RotateArrayBF1 {

private int[] getRotateArray(int[] input,int n){
		
	
	int[] output = new int[input.length];
	
	
	while(n > 0){
		
	int temp = input[0];
		
	for(int i=0;i < input.length - 1;i++){
		
			output[i] = input[i+1];
			
		}
	
	
	output[input.length - 1] = temp;
	
	input = output;	
	
	n--;
		
		
	}
	
	
return output;

}

	
	
	
	
	@Test
	public void example1(){

		int[] input = {1,2,3,4,5};
		
		int times = 2;

		int[] sumindices = getRotateArray(input, times);
		System.out.println(Arrays.toString(sumindices));
		
		}
	

	
	
}
