package homework.ds.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class P018SubStringDistinctCharacter {

	/* 

Given a string S, return the number of substrings that have only one distinct letter.

Example 1:

Input: S = "aaaba"
Output: 8
Explanation: The substrings with one distinct letter are "aaa", "aa", "a", "b".
"aaa" occurs 1 time.
"aa" occurs 2 times.
"a" occurs 4 times.
"b" occurs 1 time.
So the answer is 1 + 2 + 4 + 1 = 8.
Example 2:

Input: S = "aaaaaaaaaa"
Output: 55


Constraints:

1 <= S.length <= 1000
S[i] consists of only lowercase English letters.

	 */

	private String solution(String input){

		List<Integer> list = Arrays.stream(new int[]{1,2,3,4}).boxed().collect(Collectors.toList());
		
		int i = list.stream().reduce(1, (a, b) -> a * b);
		
		System.out.println(i);
		
		return input;
	}
	
	private String solution1(String input){

		List<Integer> list = Arrays.stream(new int[]{1,2,3,4}).boxed().collect(Collectors.toList());
		
		int i = list.stream().reduce(1, (a, b) -> a * b);
		
		System.out.println(i);
		
		return input;
	}

	@Test
	public void testData1(){

		String input= " ";

		System.out.println(solution(input));

	}

}
