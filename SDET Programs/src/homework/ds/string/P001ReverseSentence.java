package homework.ds.string;

import org.junit.Test;

public class P001ReverseSentence {

	/*

1) Given a string, you need to reverse the order of characters in each word within a sentence 
while still preserving whitespace and initial word order.

Input:  "I am doing great"
Output: "I ma gniod taerg"

Input:  "Immmm mmmh"
Output: "mmmmI hmmm"

Input:  "123456 789"
Output: "654321 987"

BF1:

1. Split the input String with "Whiespace" - returns String[] strInput

2. for(String i:strInput)
		{
		StringBuilder str = new StringBuilder();		
		System.out.println(str.append(i).reverse.toString()+" ");
		}



	 */

	
	
	
	private void solutionBF(String input){

		String[] strInput = input.split(" ");

		for(String i:strInput)
		{
			StringBuilder str = new StringBuilder();		
			System.out.print(str.append(i).reverse().toString()+" ");
		}

		System.out.println();

	}

	private void solutionUsing2Pointer(String input){

		String[] strInput = input.split(" ");

		StringBuilder sb = new StringBuilder();

		for(String indiv : strInput) {
			char[] characters = indiv.toCharArray();
			int i = 0;
			int j = characters.length - 1;
			while (i < j) {
				char temp = characters[i];
				characters[i++] = characters[j];
				characters[j--] = temp;
			}
			sb.append(String.valueOf(characters)+" ");
		}

		System.out.println(sb.toString());		
	}

	@Test
	public void testData1(){

		String input= "I am doing great";

		System.out.println(input);
//		solutionBF(input);
		solutionUsing2Pointer(input);
	}

	@Test
	public void testData2(){

		String input= "Immmm mmmh";

		System.out.println(input);
//		solutionBF(input);
		solutionUsing2Pointer(input);
	}

	@Test
	public void testData3(){

		String input= "123456 789";

		System.out.println(input);
//		solutionBF(input);
		solutionUsing2Pointer(input);
	}

}
