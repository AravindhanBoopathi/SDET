package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class P002RotateArrayReversing {

private int[] getRotateArray(int[] a,int k){
		
	
	for(int j=0; j<k; j++) {
		
		int temp = a[0];
		
		for(int i=0;i<a.length-1;i++) { //O[N]
			a[i]=a[i+1];
		}
		
		a[a.length-1]=temp;

	}
		
		

	
	
return a;

}

	
	
	
	
	@Test
	public void example1(){

		int[] input = {1,2,3,4,5};
		
		int times = 2;

		int[] sumindices = getRotateArray(input, times);
		System.out.println(Arrays.toString(sumindices));
		
		}
	

	
	
}
