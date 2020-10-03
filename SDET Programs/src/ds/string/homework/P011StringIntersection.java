package ds.string.homework;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class P011StringIntersection {

	/*

8) Given 2 Strings with length n and (n+1) respectively. 
The second String contains all the characters of first but with an extra char. 
Write the code to find the extra char

Example 1:

Input:

A1 = "Test"
A2 = "Test$"

Output: '$'

Example 2:

Input:

A1 = "Hello"
A2 = "lloreH"

Output: 'r'

---


retainAll


	 */	

	private String solution(String str1,String str2){

		StringBuffer output= new StringBuffer();
		Set<Character> set = new HashSet<Character>();

		for (char c : str1.toCharArray()) {
			set.add(c);
		}

		if(str1.length()==str2.length() || str1.equals(str2.length())) {
			return "";
		}
		for (char c : str2.toCharArray()) {
			if(!set.contains(c)) {
				output.append(c);
			}
		}
		return output.toString();
	}

	@Test
	public void testData1(){

		String str1="Test";
		String str2="Test$";

		System.out.println(solution(str1,str2));

	}	
	@Test
	public void testData2(){

		String str1="Hello";
		String str2="rolleH";

		System.out.println(solution(str1,str2));

	}	

}
