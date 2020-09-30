package ds.string;

import java.util.Arrays;

import org.junit.Test;

public class P002aAnagram {

	/*
		input= "abccbbabbabccba";

		anagram= "abc";


		1. insert anagram into set

		2. Traverse each character in the input char array
			Check if the char is in anagram set 
				


	 */

	private int solution(String input, String anagram){

		char[] inputArray= input.toCharArray();
		char[] anagramArray= anagram.toCharArray();

		int count1 = 0, count2 = 0,j=0;

		if(inputArray.length>anagramArray.length){

			while(j<inputArray.length){

				for(int i=0; i<anagramArray.length; i++){

					if(anagramArray[i]==inputArray[j]){
						count1++;
						
					}

					if(count1 > anagram.length()){
						count2++;
					}



				}

			}
		}

		return count2;
	}

	@Test
	public void testData1(){

		String input= "abccbbabbabccba";

		String anagram= "abc";

		System.out.println(solution(input,anagram));

	}

}
