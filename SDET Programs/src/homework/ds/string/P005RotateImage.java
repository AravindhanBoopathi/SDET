package homework.ds.string;

import java.util.Arrays;

import org.junit.Test;

public class P005RotateImage {

	/*	Rotate an image

 input: {[1,2,3],
  		 [4,5,6],
  		 [7,8,9]}

  		  
  		  
 output: 
 		{[7,4,1],
 		 [8,5,2],
 		 [9,6,3]}

 Pseudo-code:

  int[][] input = {[1,2,3],[4,5,6],[7,8,9]}; 

 1. Traverse input array from i=2 till 0, i--
 	2. Traverse input array from from j=0 till 2
			output[j][2-j] = input[i][j];
	 */	


	private void solution(int[][] input){

		int[][] output = new int[input.length][input.length];

		for(int j=0; j<input.length; j++){
			for(int i=input.length-1; i>=0; i--){
				output[j][input.length-1-i]=input[i][j];
			}
		}


		for(int row[]: output){
			System.out.println(Arrays.toString(row));
		}
	}

	@Test
	public void testData1(){

		int[][] input = {{1,2,3},{4,5,6},{7,8,9}};

		for(int row[]: input){

			System.out.println(Arrays.toString(row));
		}

		solution(input);
		System.out.println(input.length);

	}





}
