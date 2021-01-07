package homework.ds.string;

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


 check for open bracket  - 

 		check before the first close bracket how many open brackets count
 				if (count = zero)
 					update input the string inside open and close bracket * the integer before the open bracket

 				if (count > 0)
 					for(int i=count; count>=0; count--)
 					update the input array with string inside the last open bracket * the integer before the open bracket

	3[a2[c]]

	 */	


	private void solutionOptimal(String input){
		
		int index=0;
		int multiplier;
		StringBuffer substring =new StringBuffer();
		StringBuffer input1 =new StringBuffer(input);
		StringBuffer output =new StringBuffer();
		
		while(input1.toString().lastIndexOf('[')!=-1){
			
			multiplier = Integer.parseInt(Character.toString(input1.charAt(input1.toString().lastIndexOf('[')-1)));
			
			index = input1.toString().lastIndexOf('[')+1; 
			
			while(input1.charAt(index)!=']'){
				substring = substring.append(input1.toString().substring(index, index+1 ));
				index++;
				
			}
	
			index = index - input1.toString().lastIndexOf('[');
			
			while(multiplier>0){
				output.append(substring);
				multiplier--;
			}
			
			input1 = input1.delete(0, input1.capacity());
			input1 = input1.append( input.substring(0, input.lastIndexOf('[')-1)+
					output+
					input.substring(input.lastIndexOf('[')+index+1, input.length()));
			
			input = input1.toString();
			
			substring = substring.delete(0, input1.capacity());
			output = output.delete(0, input1.capacity());
			
		}
		System.out.println(input1);
		
	}
	
	

	@Test
	public void testData1(){

		String input= "3[a]2[bc]";
		
//		String input= "3[a2[xyz]]";
//		String input= "3[ac]";

		System.out.println(input);
		solutionOptimal(input);
	}


}


