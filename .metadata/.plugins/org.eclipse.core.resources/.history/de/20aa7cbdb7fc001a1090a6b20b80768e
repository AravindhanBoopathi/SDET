package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class P002RotateArrayReversing {

private int[] getRotateArray(int[] a,int k){
		
	// Reverse given input
	
	StringBuilder input1 = new StringBuilder(); 
	StringBuilder flip1 = new StringBuilder(); 
	StringBuilder flip2 = new StringBuilder(); 
	input1.append(Arrays.toString(a));  
    input1 = input1.reverse(); 
	
    
	//  split reverse input into k 
    String flip1a,flip2a;
    flip1a= input1.substring(0,input1.length()- (k + 3));
	flip2a= input1.substring(input1.length()-(k+3),input1.length()-1);
	
	flip1.append(flip1a);
	flip1 = flip1.reverse();
	
	flip2.append(flip2a);
	flip2 = flip2.reverse();

	
	System.out.println(flip1.toString()+flip2.toString());
    
	
	
	
	throw new RuntimeException("No Matching indices");

}

	
	
	
	
	@Test
	public void example1(){

		int[] input = {1,2,3,4,5};
		
		int times = 2;

		int[] sumindices = getRotateArray(input, times);
		System.out.println(Arrays.toString(sumindices));
		
		}
	
	
	@Test
	public void example2(){

		int[] input = {7,8,9,10,13,15};
		
		int times = 1;

		int[] sumindices = getRotateArray(input, times);
		System.out.println(Arrays.toString(sumindices));
		
		}
	
	
}
