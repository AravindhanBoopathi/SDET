package revision.arrays.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class slidingHash {

	/*	
Given 2 strings, find all the start indices of second string anagrams in first string.
Note:
Strings consists of lowercase letters only 
The order of output does not matter.
Input:
s: "abab" p: "ab"
Output:
[0, 1, 2]
Input:
s: "testetr" p: "te"
Output:
[0, 3, 4]
Sliding Window + HashMap 

pseudo-code:
1. slide the input string with the length of the second string and add it as key
2. add the next char
3. remove the first char
4. add them as key
5. value - index
6. sort the anagram and key and check if it is equl and save it in output array


	 */	
	private List<Integer> solution(String input, String p){

		List<Integer> output = new ArrayList<>();
		Map<Integer,String> map = new HashMap<>();
		
		String windowString = " ";
		
		for(int i=0; i<=input.length()-p.length(); i++){
			windowString = input.substring(i, p.length()+i);
			map.put(i,windowString);
		}
		
		System.out.println(map);

		
		return output;
	}

	@Test
	public void testData1(){

		String input= "abab";
		String p= "ab";

		System.out.println(solution(input,p));

	}
}
