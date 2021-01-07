package revision.arrays.string;

import org.junit.Test;

public class P014 {

	/*
	Sliding Window 

Problem 1)

Given two strings s and t, return the minimum window in s which will contain all the characters in t.
If there is no such window in s that covers all characters in t, return the empty string "".

Note that If there is such a window, 
it is guaranteed that there will always be only one unique minimum window in s.


Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Example 2:

Input: s = "a", t = "a"
Output: "a"
 
Problem 2)

Given an array A of 0s and 1s, we may change up to K values from 0 to 1.

Return the length of the longest (contiguous) subarray that contains only 1s. 

Example 1:

Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
Output: 6
Explanation: 
[1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
Example 2:

Input: A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
Output: 10
Explanation: 
[0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
	
	
	*/
	@Test
	public void solution1(){
		
		String s = "ADOBECODEBANC", t = "ABC";
		
/*		Pseudo-code:
		1. Set WindowString in s using t's length
		2. Check windowstring contains all the letters in t
		3. Else add the next character go to Step 2
		4. Once Step 2 passes, Save the minimum String and try remove the first character and go to Step 2
		
*/		
		int windowSize = t.length();
		String windowString = s.substring(0, windowSize);
		
		
		
	
	
	}
	
	
}
