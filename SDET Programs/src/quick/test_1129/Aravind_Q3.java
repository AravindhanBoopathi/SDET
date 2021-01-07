package quick.test_1129;

import org.junit.Test;

public class Aravind_Q3 {
/*
3) Given an input array and two unique numbers, find the smallest distance between those 2 numbers
   Example:a
   
   Input1: [5,6,8,9,1,4,1] 
   Input2: 8,1 
   Output: 2
      a) If there are no occurances of the unique numbers, then throw exception
      b) If there are multiple matches, the least distance should be considered
	
	
	pseudo-code:
	1. find index of input2[0] in input1 array
			if match found then 
			  find index of input1[1] in input1 array
			  	 if second match found then 
			  	 	find diff
			  	 	find min 
	
*/

	
	private int solution(int[] input1, int[] input2){

		int diff = 0, min = input1.length;
		
		for(int i=0; i<input1.length; i++){
			if(input1[i] == input2[0]){
				for(int j=i+1; j< input1.length; j++){
					if(input1[j]==input2[1]){
						diff = j - i;
						min = Math.min(min, diff);
//						input1[j]=' ';
					}
				}
			}
			
			
		}
		

	return min;
}

@Test
public void testData1(){

	int input1[]= {8,6,2,9,1,8,4,1};
	int input2[]= {8,1};

	
	System.out.println(solution(input1, input2));

}
	

}
