package homework.ds.string;

import java.util.Arrays;

import org.junit.Test;

public class P012AnagramSentence {

	/*

9) Write a program that tells all the words containing same letters(anagram)
Input  : "Stale are there in tesla and you can steal the pears"
Output : [Stale, tesla, steal]



	 */	

	private void solution(String input){

		String[] inputs = input.split(" ");

		System.out.println(Arrays.toString(inputs));

		for(int i=0; i< inputs.length; i++){
			for(int j=i+1; j< inputs.length; j++){
				
				if(inputs[i].trim().length() == inputs[j].trim().length() && checkAnagram(inputs[i].trim().toCharArray(), inputs[j].trim().toCharArray())){
					System.out.println(inputs[i] +"\n"+ inputs[j]);
				}
			}

		}
	}




	public boolean checkAnagram(char[] input1, char[] input2){
		
		int count =0;

		for(int i=0; i<input1.length; i++){
			for(int j=0; j<input1.length; j++){
				if(Character.toLowerCase(input1[i])==Character.toLowerCase(input2[j]))count++;
			}
		}

		if(count == input1.length)
			return true;

		return false;
	}

	@Test
	public void testData1(){

		String input = "Stale are there in tesla and you can steal the pears";

		solution(input);

	}


}
