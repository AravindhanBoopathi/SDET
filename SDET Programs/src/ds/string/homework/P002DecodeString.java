package ds.string.homework;

import java.util.Arrays;

import org.junit.Test;

public class P002DecodeString {

/*	

2) Given an encoded string, return its decoded string.

Input: s = "3[a]2[bc]"

			3 , a, 2, bc
Output: "aaabcbc"

Input: s = "3[a2[c]]"
Output: "accaccacc"

BF1:

	1. Split the input String with "Wildcard values" - returns String[] strInput = input.split("\\W+");
	
	
	2. for(int i=0; i < strInput.length-1; i++)
	 if(Character.isDigit(input[i])){
			
			
			
			
			for(int j=0; j<Character.getNumericvalue(input[i]); j++){
				syso(input[i+1]);
				if(Character.isAlpha(input[i+1]))syso(input[i+]);
			}
	
	
BF2:

	
	
	
*/	
	
	private void solutionBF(String input){
	
		String[] strInput = input.split("\\W+");
		
	/*	for(int i=0; i < strInput.length-1; i++){
			if(Integer.parseInt(strInput[i])>0){
				
			}
			
		}
		*/
		
		System.out.println(Arrays.toString(strInput));
		
	}

	@Test
	public void testData1(){

		String input= "3[a2[c]]";
		
		System.out.println(input);
		solutionBF(input);
	}

	
}
