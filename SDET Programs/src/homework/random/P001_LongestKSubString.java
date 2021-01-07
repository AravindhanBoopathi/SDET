package homework.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class P001_LongestKSubString {

	/*
Problem as of 10/11:

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1: 

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

Example 3:

Input: s = "eceeeebbbbb", k = 2
Output: 9
Explanation: T is "eeeebbbbb" which its length is 9.

Example 4:

Input: s = "ecee    ", k = 2
Output: 6
Explanation: T is "ee    " which its length is 6.

	 */
	
	@Test
	public void testData1(){

		String input= "eceba";
		int k=2;

		System.out.println(findLengthOfKDistinctChar(input,k));

	}
	
	@Test
	public void testData2(){

		String input= "aa";
		int k=1;

		System.out.println(findLengthOfKDistinctChar(input,k));

	}

	@Test
	public void testData3(){

		String input= "eceeeebbbbb";
		int k=2;

		System.out.println(findLengthOfKDistinctChar(input,k));

	}
	
	@Test
	public void testData4(){

		String input= "ecee    ";
		int k=2;

		System.out.println(findLengthOfKDistinctChar(input,k));

	}
	
	@Test
	public void testData5(){

		String input= "";
		int k=2;

		System.out.println(findLengthOfKDistinctChar(input,k));

	}
	
	@Test
	public void testData6(){

		String input= "abc";
		int k=-1;

		System.out.println(findLengthOfKDistinctChar(input,k));

	}
/*	
	pseudo-code:

		Optimal:
		
		1. Declare variables: max
		2. Declare interfaces: list(to hold windowElements) ,set(to hold unique values)
		3. Traverse input elements from left to right
		4. Add current element in list - window
		5. Add current element in set - unqSet
		6. check if unqSet.size() <= k, then find max(Math.max(max, window.size()))
		7. check if unqSet.size() > k, then perform Step 8 and 9.
		8. Slide the window by removing the first element of the Window list.
		9. Continue removing the list and check unqSet for the removed list presence.
		10. Repeat step 8 to 9 till unqSet.size <= k.
		11. Return max.

		Edge-case: if k>input.length, then return input.length 

		Exceptions: if input is blank or k <= 0
					

*/	
	public int findLengthOfKDistinctChar(String s, int k){

		if(k <= 0)	throw new RuntimeException("Invalid K value");
		if(s.isEmpty())	throw new RuntimeException("Invalid input string");
		
		char[] input = s.toCharArray();
		int max = 0;
		
		List<Character> window = new ArrayList<>();
		Set<Character> unqSet = new HashSet<>();

//		Performance: O(N*M)
		
		for(int i=0; i<input.length; i++){		// O(N)								

			window.add(input[i]);
			unqSet.add(input[i]);
			
			if(unqSet.size()<=k)	max = Math.max(max, window.size());
						
			while(unqSet.size()>k){				// O(M)
				char remove = '\0';
				window.remove(0);

				for(char c: unqSet){
					if(!window.contains(c))	remove = c;
				}
				if(remove != '\0')	unqSet.remove(remove);
				
			}

		}

		return max;
	}

		
		//			eceeeebbbbb

	
		
		//		for (Iterator<Character> iterator = unq.iterator(); iterator.hasNext();) {
		//	        if(!window.contains(iterator.next())){
		//	            unq.remove(iterator.next());
		//	        }
		//		


		//		int[] ascii = new int[256];
		//			ascii[input[i]]++;
		//			if(ascii[input[i]] == 1)	count++;	//Unique count
		//			
		//			if(count <= k){
		//				max = Math.max(max, i - left);
		//			}
		//			
		//			if(count > k){
		//				ascii[input[left++]]--;
		//				i=left;
		//				count = 0;
		//			}
		//			
		//			
		//			
		//		}
		//			eceeeebbbbb => add one remove origin approach
		//		    0123456
		//			eceba 
		//			aabccc
		//			aabccvvvartybbbbbbbbbbb
		//			ascii[input[i]]++;
		//			right++;
		//			
		//			if(ascii[input[i]] == 1){
		//				count++;
		//			}
		//			
		//			if(count > k){
		//				left = right;
		//				count = 1;
		//			}else
		//			max = Math.max(max, right - left);
		//			
		//		}


}
