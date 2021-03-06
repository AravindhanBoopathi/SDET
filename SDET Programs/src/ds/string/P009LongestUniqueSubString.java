package ds.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class P009LongestUniqueSubString {

	/*
1) Longest Substring Without Repeating Characters
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring. 	


pseudo-code:

BF

Set





	 */

	/* 
	 * 
	 * 
	 */

//  pwwkewwabcdee

	private void solution1(String input){
		char[] inpChar=input.toCharArray();
		
		int[] inpArr=new int[256];
		int max = 0,count=1;
		
		for (int i = 0; i < inpChar.length; i++) {
			inpArr[input.charAt(i)]++;
			count++;
			max = Math.max(max, count);
			
			if(inpArr[input.charAt(i)]>1 ){
				inpArr[input.charAt(i)]=0;
				count =1;
			}
			
			
		}
		
		System.out.println(max);
	}


	private void solution2(String input){
		
		int max = 0;
		
		Set<Character> set = new HashSet<Character>();
		
		for(Character c: input.toCharArray()){
			if(set.contains(c))
				set.remove(c);
			else 
				set.add(c);
		}
		
		if(set.size()>1){
			max = input.length() - set.size()+1;
		}else{
			max = input.length();
		}
		
		System.out.println(max);
			
	}

	
	
	private void solution(String input){

		int max = 0;

		List<Character> list = new ArrayList<Character>();

		for(Character c: input.toCharArray()){
			if(list.contains(c)){
				max = Math.max(max, list.size());
				list.clear();
			}
			list.add(c);
			max = Math.max(max, list.size());
		}

		System.out.println(max);
	}

	@Test
	public void testData1(){

		String input = "abcde";

		solution2(input);

	}
//
//	@Test
//	public void testData2(){
//
//		String input = "bbbbb";
//
//		solution1(input);
//
//	}
//
//	@Test
//	public void testData3(){
//
//		String input = "pwwkewwabcdee";
//
//		solution1(input);
//
//	}


}
