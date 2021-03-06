package revision.arrays.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P013LetterWordMap {

	/* 
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Input: pattern = "abc", s = "hello world world"
Output: false
Algorithm: HashMap


1. convert pattern to charArray
2. split string to stringArray
3. Map Char, String  
	

	 */

	private Boolean solution(String pattern1, String s){

		char[] pattern = pattern1.toCharArray();
		String[] strings = s.split(" ");

		System.out.println(Arrays.toString(strings));
		
		if(pattern.length != strings.length)
			throw new RuntimeException("Pattern length and String Leangth are not matching");
		
		Map<Character, String> map = new HashMap<>();

		for(int i=0; i<pattern.length; i++){

			if(map.containsKey(pattern[i])){
				if(!(map.get(pattern[i]).equals(strings[i])))
					return false;

			}
			else
				map.put(pattern[i], strings[i]);
				

		}

		System.out.println(map);
		return true;
	}

	@Test
	public void testData1(){

		String pattern= "abba";
		String s= "dog dog dog dog";
		System.out.println(solution(pattern, s));

	}
//	@Test
//	public void testData2(){
//
//		String pattern= "abba";
//		String s= "dog cat cat fish";
//		System.out.println(solution(pattern, s));
//
//	}
}
