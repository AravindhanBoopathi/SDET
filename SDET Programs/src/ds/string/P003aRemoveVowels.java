package ds.string;

import java.util.Arrays;

import org.junit.Test;

public class P003aRemoveVowels {

	/*
	 * remove vowels
	 * 
		input = "testleaf";

		vowel = "aeiou";

		1. replaceAll - string = string.replaceAll("[AaEeIiOoUu]", "");

		2. 
			if(charAt(i).indexof()!=-1){
				remove charAt(i);
			}




	 */


	private String solution(String input){

//		for(int i=0; i<input.length(); i++)
//			if(input.charAt(i)=='a'){
//				continue;
//			}
		
		
		String str="abbcccd",str2="";
		for (int i = 0; i < str.length(); i++) {
			int fr=str.indexOf(str.charAt(i));
			int last= str.lastIndexOf(str.charAt(i));
			if(fr==last)
			{
				str2=str2+str.charAt(i);
			}
			
	}
		System.out.println(str2);

		return str2;
	}

	@Test
	public void testData1(){

		String input= "testleaf";

		System.out.println(solution(input));

	}
}
