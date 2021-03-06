package homework.ds.string;

import java.util.Arrays;

import org.junit.Test;

public class P008ReverseWave {

	/*	
5) Given a matrix, print it in Reverse Wave Form.

Input :  1  2  3  4
         5  6  7  8
         9  10 11 12
         13 14 15 16
         
         {1,2,3,4},
         {5,6,7,8},
         {9,10,11,12}

Output : 4 8 12 16 15 11 7 3 2 6 10 14 13 9 5 1

Pseudo-code:

1. 0,3 1,3 2,3 3,3 3,2 

 		for(int i=3; i>0; i--){

 				if(i%2!=0)
 				for(int j=0; j<3; j++)
 				input[j][i];
 				else
 				for(int j=3; j>0; j--)
 				input[i][j];

 			}



	 */	

	private void solution(int[][] input){

//		int[][] output = new int[input.length][input.length];

		int row=input[0].length-1, column=input.length-1;

		for(int i=Math.min(row, column); i>=0; i--){

			if(i%2!=0)
				for(int j=0; j<Math.max(row, column); j++){
					System.out.print(input[j][i] + " ");
				}
			else
				for(int j=Math.max(row, column); j>=0; j--){
					System.out.print(input[j][i] + " ");
				}
			
		}
/*

		for(int row[]: output){
			System.out.println(Arrays.toString(row));
		}*/
	}

//	@Test
//	public void testData1(){
//
//		int[][] input = {{1,2,3,4},
//						 {5,6,7,8},
//						 {9,10,11,12},
//						 {13,14,15,16}};
//
//		for(int row[]: input){
//
//			System.out.println(Arrays.toString(row));
//		}
//
//		solution(input);
//		System.out.println();
//
//	}

	@Test
	public void testData2(){

		int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

		for(int row[]: input){

			System.out.println(Arrays.toString(row));
		}

		solution(input);
//		System.out.println(input.length);

	}
	
//	{{1,2,3,4},{5,6,7,8},{9,10,11,12}}

}
