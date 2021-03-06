package revision.arrays.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class P012AcrossStrings {

/*	
Given an array of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  
For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.
You may return the answer in any order.
Input: ["bella","label","roller"]
Output: ["e","l","l"]
Input: ["cool","lock","cook"]
Output: ["c","o"]

pseudo-code:

1. Find the minimum inputString
 	1.1 Traverse 
 	
2. Traverse int i =0 till minimum length String
		char match = minString.charAt(i);
	2.1 Traverse all the String with the above match	
 			(int j=0; j< inputArray.length; j++)
 			if(inputArray[j].indexOf(match))count
 			
 			
 			
Write a function that takes 2 strings as input and 
returns a string with uncommon characters of the input strings.

Example: Input: String1 = "aabde" String2 = "cbaz"

 		1.insert string1 in a set
 		2.try adding each char of String2 in the above set, if it is true, save it in a String
 		
 		1.insert string1 ascii array 256
		2.
		
		1. indexOf
		
		2. map
		
		
Write a function to print the first duplicate number in the array
Example: [4,1,2,9,1]
Output: 1

	1.insert input in a set
 	2.try adding each char of String2 in the above set, if it is true, save it in a String	
*/	
	
	private int solution(int[] input){

		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<input.length; i++){
			if(!set.add(input[i])){
				return input[i];
			}
		}
		

		throw new RuntimeException("No duplicate found ");
	}
	
	private int solutionMap(int[] input){

		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i: input){
			if(map.containsKey(i)){
				return i;
			}
			map.put(i, 1);
		}
		

		throw new RuntimeException("No duplicate found ");
	}

	private int solutionBF(int[] input){

		for(int i=0; i<input.length; i++){
			for(int j=i+1; j<input.length; j++){
				if(input[i]==input[j]){
					return input[i];
				}
			}
		}

		throw new RuntimeException("No duplicate found ");
	}
	
	@Test
	public void testData1(){

		int input[]= {4,1,2,9,1};

		System.out.println(solutionBF(input));

	}

	
}
