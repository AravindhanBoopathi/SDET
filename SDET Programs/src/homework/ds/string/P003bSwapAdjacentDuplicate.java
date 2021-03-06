package homework.ds.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class P003bSwapAdjacentDuplicate {

	/*
	 * 3) Given a string, check if the letters can be rearranged so that two
	 * characters that are adjacent to each other are not the same.
	 * 
	 * Input: "aab" Output: "aba" conscount = 2 remLetters = 3 - 2 = 1 logic =
	 * remainingletters * 2 >= consecutiveCount 2 >= 2
	 * 
	 * Input: "aaaaabcde" Output: "abacadaea" conscount = 5 remLetters = 9 - 5 =
	 * 4 logic = remainingletters * 2 >= consecutiveCount 4*2=8 >= 5
	 * 
	 * 
	 * 
	 * Input: "bbcdefaaaaa" Output: "ababacadaef" conscount = 7 remLetters = 11
	 * - 7 = 4 logic = remainingletters * 2 >= consecutiveCount 4*2=8 >= 7
	 * 
	 * 
	 * 
	 * Input: "aaaaabbbbcccdeff" Output: "ababacadaef"
	 * 
	 * conscount = 14 remLetters = 16 - 14 = 2
	 * 
	 * logic = remainingletters * 2 >= consecutiveCount 4*2=8 >= 7
	 * 
	 * 
	 * 
	 * Input: "aaab" Output: "" conscount = 3 remLetters = 4 - 3 = 1 logic =
	 * remainingletters * 2 >= consecutiveCount 1*2=2 >= 3
	 * 
	 * Input: "aaabcdeee" Output: "aeaeaebcd" conscount = 6 remLetters = 9 - 6 =
	 * 3 logic = remainingletters * 2 >= consecutiveCount 3*2=6 >= 6
	 * 
	 * 
	 * 
	 * Input: "a" Output: ""
	 * 
	 * BF: consecutiveInputCount=0; left=0; right=input.length-1;
	 * 
	 * 1. Traverse i=0 till input.length - 1 i. input[i] == input[i+1]{
	 * consecutiveInputCount = consecutiveInputCount + 1; }
	 * 
	 * remainingletters = input.length - consecutiveCount; }
	 * 
	 * 2. if( remainingletters * 2 >= consecutiveCount ){
	 * 
	 * sort input;
	 * 
	 * 
	 * 
	 * i. while(left < right)
	 * 
	 * Input: "aaaaaaabbcdef" Output: "afaaaaabbcdea" "afadaaabbcaea"
	 * "afadababacaea"
	 * 
	 * 
	 * "aaaaabbcdef" afaaabbcdea
	 * 
	 * 
	 * 
	 * 
	 * afaaabbcdea afadabbcaea afadabbcaea a. if(input[left])== input[left+1])
	 * 
	 * char temp = input[++left]; input[left++] = input[right]; input[right--] =
	 * temp; right--;
	 * 
	 * left++; right--;
	 * 
	 * 
	 * }
	 * 
	 */

	private void solutionBF(String input) {

		char[] strInput = input.toCharArray();
		char[] strOutput = new char[strInput.length];
		
		if (strInput.length < 2) {
			throw new IllegalArgumentException();
		}

		else {
			Map<Character, Integer> map = new HashMap<Character, Integer>();

			for (char c : strInput) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}

			List<Entry<Character, Integer>> list = new LinkedList<Entry<Character, Integer>>(map.entrySet());
			// sorting the list elements
			Collections.sort(list, new Comparator<Entry<Character, Integer>>() {
				public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {

					return o2.getValue().compareTo(o1.getValue());
				}
			});

			System.out.println(list);
			
			int left = 0, right = 1,j=0;

			for (int i = 0; i < strInput.length; i++) {

				if (list.get(left).getValue() > 0) {
					System.out.print(list.get(left).getKey());
					strOutput[j++] = list.get(left).getKey();
					list.get(left).setValue(list.get(left).getValue() - 1);
				} else if (list.get(left).getValue() == 0) {
					list.remove(left);
					
				}

				if (list.get(right).getValue() > 0) {
					System.out.print(list.get(right).getKey());
					strOutput[j++] = list.get(right).getKey();
					list.get(right).setValue(list.get(right).getValue() - 1);
				} else if (list.get(right).getValue() == 0) {
					list.remove(right);

					System.out.print(list.get(right).getKey());
					strOutput[j++] = list.get(right).getKey();					
					list.get(right).setValue(list.get(right).getValue() - 1);
				}

				
			}
		}
		
		System.out.println(Arrays.toString(strOutput));
	}

	@Test
	public void testData1() {

		String input = "aab";

		System.out.println(input);
		solutionBF(input);

	}

	@Test
	public void testData2() {

		String input = "aaaaabcde";

		System.out.println("\n\n"+input);
		solutionBF(input);

	}

	@Test
	public void testData3() {

		String input = "bbcdefaaaaa";

		System.out.println("\n\n"+input);
		solutionBF(input);

	}

	@Test
	public void testData4() {

		String input = "aaaaabbbbcccdeff";

		System.out.println("\n\n"+input);
		solutionBF(input);

	}

	@Test
	public void testData5() {

		String input = "aaaabbbbcccc";

		System.out.println("\n\n"+input);
		solutionBF(input);

	}

	@Test
	public void testData6() {

		String input = "aaabcdeee";

		System.out.println("\n\n"+input);
		solutionBF(input);

	}

	@Test
	public void testData7() {

		String input = "abb";

		System.out.println("\n\n"+input);
		solutionBF(input);

	}

}
