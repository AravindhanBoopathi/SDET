package revision.arrays.string;

import org.junit.Test;

public class P005FunWithVowels {
	/* 

A subsequence is a sequence of letters in a string, in order, but with any number of characters removed.  
Vowels in order are the letters in the string aeiou.  
Given a string, determine the length of the longest subsequence that contains all of the vowels, in order, and no vowels out of order.   

aeeiiaouu

"aeiaaioooaauuaeiu"

for(){


substring(0, indexOf(vowel[i]))
input.replaceAll(vowel[i],"")
}
aeiiooouuu 

while(in){


	 */

	private int solution(String input){

		StringBuffer output = new StringBuffer();

		char[] vowels = {'a', 'e', 'i', 'o', 'u'};


		for(int i=0; i < vowels.length; i++){

			if(input.indexOf(vowels[i]) == -1){
				return 0;
			}	

			try{
				int lastIndex = input.indexOf(vowels[i])+1;
				char currentVowel = input.charAt(input.indexOf(vowels[i]));

				while(currentVowel == input.charAt(lastIndex)){
					lastIndex++;
				}
				output = output.append(input.substring(input.indexOf(vowels[i]), lastIndex));
				input = input.replaceAll(Character.toString(vowels[i]), "");

			}catch(StringIndexOutOfBoundsException e){
				output = output.append(input);
			}
//			System.out.println(input);

		}

		System.out.println(output.toString());
		return output.length();
	}

	@Test
	public void testData1(){

		String input= "aeiaaioooaauuaeiu";

		System.out.println(input);
		System.out.println(solution(input));

	}

	@Test
	public void testData2(){

		String input= "aeiaaiooaa";

		System.out.println(input);
		System.out.println(solution(input));

	}

	@Test
	public void testData3(){

		String input= "aeeiiaouu";

		System.out.println(input);
		System.out.println(solution(input));

	}

	
}
