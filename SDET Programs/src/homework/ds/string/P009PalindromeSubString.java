package homework.ds.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class P009PalindromeSubString {

	/*	

6) Given a string, how many palindromic substrings in this string.

Example 1:

Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

Example 2:

Input: "aabc"
Output: 4
Explanation: Three palindromic strings: "a", "b", "c", "aa".


Pseudo-code:

1. Add input in set and print (Since all unique characters are palindrome)


2. Traverse input from current index(i=0) and increment current index till (i=input.length - 1)
  		Traverse input from next index(j=i+1) till (j=input.length - 1)
				check if(input.SubString(i,j).equals(input.SubString(i,j).reverse())
					syso(input.SubString(i,j))


	 */	

	private void solution(String input){

		char[] inputChar = input.toCharArray();
		StringBuilder input1 = new StringBuilder();

		List<Character> list = new ArrayList<Character>(); 
		for(char c: inputChar)
			list.add(c);
		//		System.out.println(set);

		Iterator<Character> iterator = list.iterator(); 
		while (iterator.hasNext()) 
			System.out.println(iterator.next());

		for(int i=0; i< inputChar.length; i++){
			for(int j=i; j< inputChar.length-1; j++){

				String original = input1.append(input.substring(i, j+2)).toString();
				String reverse = input1.reverse().toString();
				input1.delete(0, j+2);

				if(original.equals(reverse)){
					System.out.println(original);
				}
			}

		}

	}

	private void solutionOptimal(String input){

		char[] inputChar = input.toCharArray();
		StringBuilder input1 = new StringBuilder();

		List<String> list = new ArrayList<String>(); 
		for(char c: inputChar){
			String temp = Character.toString(c);
			list.add(temp);
		}

		Iterator<String> iterator = list.iterator(); 
		while (iterator.hasNext()) 
			System.out.println(iterator.next());
				
		for(int i=0; i<= inputChar.length-1; i++){
			list.add(input.substring(i, inputChar.length));
			
		}

		for(int i=inputChar.length-1; i> 0; i--){

			list.add(input.substring(0, i));
			
		}
		
		for(String s: list){
		
		StringBuffer inputRev = new StringBuffer();	
		
		inputRev.append(s).reverse();
		
		String rev = inputRev.toString();
		
		if(s.equals(rev) && s.length()>1)
		System.out.println(s);
		
		}
		
	}


	@Test
	public void testData1(){

		String input ="aaa";

		solution(input);
		solutionOptimal(input);

	}

	@Test
	public void testData2(){

		String input ="aabc";

		solution(input);
		solutionOptimal(input);

	}

}
