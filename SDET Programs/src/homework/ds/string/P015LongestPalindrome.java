package homework.ds.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class P015LongestPalindrome {

	/* 
	 * Find the longest palindrome
	 * 
	 *  input = abaababaab
	 *  output = baababaab
	 * 
	 * 	input = madamamadaa
	 *  output = baababaab
	 * 
	 * 
	 */

	private void solution(String input){
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

		System.out.println(list);

		for(String s: list){

			StringBuffer inputRev = new StringBuffer();	

			inputRev.append(s).reverse();

			String rev = inputRev.toString();

			if(s.equals(rev) && s.length()>1)
				System.out.println(s);

		}



	}

	private void solution1(String input){

		String maxP= "" ;
		String ainput = "";
		
		Set<String> set = new HashSet<String>();

//  	amadm   aab
//		amamd	aba
//		ammad	baa
//		ammda	baa
//		amdma	baa
//		amdam	baa
//		maadm
//		maamd
//		mamad
//		mamda
//		madma
//		madam
		
		for(int i=0; i< input.length(); i++){
			ainput = "";
			for(int j=i+1; j< input.length(); j++){
				
				ainput = ainput+Character.toString(input.charAt(i))+Character.toString(input.charAt(j));
				set.add(ainput);
			}
		}
		System.out.println(set);
		
		Iterator<String> iterator = set.iterator(); 
		while (iterator.hasNext()) {
			StringBuilder s = new StringBuilder(iterator.next());

			if(s.toString().equals(s.reverse().toString())){
				if(s.length()>maxP.length())
					maxP = s.toString();
			}

		}
		System.out.println(maxP.length());
	}


//	private static int countPalindromeStrings(String S) {
//		int N = S.length(), result = 0;
//
//		for (int center = 0; center <= 2*N-1; ++center) {
//			int left = center / 2;
//			int right = left + center % 2;
//
//			while (left >= 0 && right < N && S.charAt(left) == S.charAt(right)) {
//				result++;
//				left--;
//				right++;
//			}
//		}
//		return result;
//	}



	@Test
	public void testData1(){

		String input = "amadm";

		solution1(input);

	}

//	@Test
//	public void testData2(){
//
//		String input = "abaababaab";
//
//		solution1(input);

//	}

	

}
